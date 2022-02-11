package com.designpatterns.behavioural.template;

public abstract class Task {
    AuditTrail auditTrail = new AuditTrail();

    abstract void doRecord();

}
