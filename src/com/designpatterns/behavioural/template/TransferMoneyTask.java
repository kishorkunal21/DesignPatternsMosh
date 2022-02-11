package com.designpatterns.behavioural.template;

public class TransferMoneyTask extends Task{

    @Override
    void doRecord() {
        auditTrail.record("TransferMoneyTask");
    }
}
