package com.codewithnas.behavioural.template.polymorphism;

public class TaskExecutor {
    private AuditTrail auditTrail;

    public TaskExecutor() {
        auditTrail = new AuditTrail();
    }

    public TaskExecutor(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(Task task) {
        auditTrail.record();
        task.execute();
    }


}
