package org.example.util.reporting;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;

public class JReporter implements ConcurrentEventListener{

    public void onTestCaseStarted(TestCaseStarted event){
        TestCase testCase = event.getTestCase();
        System.out.println("Starting "+ testCase.getName());
    }
    public void onTestCaseFinished(final TestCaseFinished event){
        TestStep tonces = (TestStep) event.getTestCase();
        System.out.println("Finished "+ tonces.getCodeLocation());
        Result result = event.getResult();

        if(result.getStatus() == Status.FAILED){
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


