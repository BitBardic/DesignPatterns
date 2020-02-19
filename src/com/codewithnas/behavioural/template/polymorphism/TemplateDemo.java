package com.codewithnas.behavioural.template.polymorphism;

public class TemplateDemo {
    public static void main(String[] args) {
        var taskExecutor = new TaskExecutor();
        taskExecutor.execute(new TransferMoney());
        taskExecutor.execute(new GenerateReport());
    }
}
