package com.structural.command.example.commands;

import com.structural.command.example.receiver.Game;

public class SoundVolume implements Command
{
    Game game;

    public SoundVolume(Game game)
    {
        this.game = game;
    }

    @Override
    public void execute()
    {
        System.out.println("Sound volume button was pressed");
        game.setSoundVolume(24);
        System.out.println("Game sound volume is set " + game.getSoundVolume());
    }
}
