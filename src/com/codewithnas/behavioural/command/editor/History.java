package com.codewithnas.behavioural.command.editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();
    public int size() {
        return commands.size();
    }

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

}
