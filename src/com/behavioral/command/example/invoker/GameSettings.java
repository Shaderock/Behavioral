package com.behavioral.command.example.invoker;

import com.behavioral.command.example.commands.Command;

import java.util.ArrayList;

public class GameSettings
{
    ArrayList<Command> commands;

    public GameSettings(ArrayList<Command> commands)
    {
        this.commands = commands;
    }

    public void buttonPressed(int commandIndex)
    {
        commands.get(commandIndex).execute();
    }
}
