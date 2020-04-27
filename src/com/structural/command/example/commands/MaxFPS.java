package com.structural.command.example.commands;

import com.structural.command.example.receiver.Game;

public class MaxFPS implements Command
{

    Game game;

    public MaxFPS(Game game)
    {
        this.game = game;
    }

    @Override
    public void execute()
    {
        System.out.println("Max FPS button was pressed");
        game.setMaxFPS(60);
        System.out.println("Game max FPS is set " + game.getMaxFPS());
    }
}
