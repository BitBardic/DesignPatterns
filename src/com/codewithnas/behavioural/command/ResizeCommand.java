package com.codewithnas.behavioural.command;

import com.codewithnas.behavioural.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
