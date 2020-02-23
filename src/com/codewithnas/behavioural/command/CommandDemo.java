package com.codewithnas.behavioural.command;

import com.codewithnas.behavioural.command.fx.Button;

public class CommandDemo {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
