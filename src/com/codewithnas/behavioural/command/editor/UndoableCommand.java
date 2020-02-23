package com.codewithnas.behavioural.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
