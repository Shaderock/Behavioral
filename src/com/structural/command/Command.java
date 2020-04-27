package com.structural.command;

import com.structural.command.example.commands.MaxFPS;
import com.structural.command.example.commands.MusicVolume;
import com.structural.command.example.commands.SoundVolume;
import com.structural.command.example.invoker.GameSettings;
import com.structural.command.example.receiver.Game;
import com.structural.showcase.Pattern;

import java.util.ArrayList;

public class Command extends Pattern
{

    public Command(String name)
    {
        super(name);
    }

    @Override
    public void demonstrate()
    {
        Game game = new Game();

        ArrayList<com.structural.command.example.commands.Command> commands = new ArrayList<>();
        commands.add(new SoundVolume(game));
        commands.add(new MusicVolume(game));
        commands.add(new MaxFPS(game));

        GameSettings gameSettings = new GameSettings(commands);

        for (int i = 0; i < commands.size(); i++)
        {
            gameSettings.buttonPressed(i);
        }
    }
}
