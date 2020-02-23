package com.codewithnas.behavioural.command;

import com.codewithnas.behavioural.command.fx.Button;

public class CompositeCommandDemo {
    public static void main(String[] args) {

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());

        composite.execute();
    }
}
