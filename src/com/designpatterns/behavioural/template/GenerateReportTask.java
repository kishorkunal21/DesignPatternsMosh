package com.designpatterns.behavioural.template;

public class GenerateReportTask extends Task{
    @Override
    void doRecord() {
        auditTrail.record("GenerateReportTask");
    }
}
