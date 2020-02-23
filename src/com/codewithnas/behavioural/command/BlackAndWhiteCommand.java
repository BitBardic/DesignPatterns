package com.codewithnas.behavioural.command;

import com.codewithnas.behavioural.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
