package com.behavioral.command.example.commands;

import com.behavioral.command.example.receiver.Game;

public class MusicVolume implements Command
{

    Game game;

    public MusicVolume(Game game)
    {
        this.game = game;
    }

    @Override
    public void execute()
    {
        System.out.println("Music volume button was pressed");
        game.setMusicVolume(36);
        System.out.println("Game music volume is set " + game.getMusicVolume());
    }
}
