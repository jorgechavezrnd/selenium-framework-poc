package com.mesaj.app.util.reporting;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;

public class JListener implements ConcurrentEventListener {

    public void onTestCaseStarted(TestCaseStarted event) {
        TestCase testCase = event.getTestCase();
        System.out.println("Starting " + testCase.getName());
    }

    private void onTestCaseFinished(final TestCaseFinished event) {
        TestCase testCase = event.getTestCase();
        System.out.println("Finished: " + testCase.getName());

        Result result = event.getResult();
        if (result.getStatus() == Status.FAILED) {
            final Throwable error = result.getError();
            error.printStackTrace();
        }
    }

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseStarted.class, this::onTestCaseStarted);
        publisher.registerHandlerFor(TestCaseFinished.class, this::onTestCaseFinished);
    }

}
