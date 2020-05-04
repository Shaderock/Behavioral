package com.behavioral.command;

import com.behavioral.command.example.commands.MaxFPS;
import com.behavioral.command.example.commands.MusicVolume;
import com.behavioral.command.example.commands.SoundVolume;
import com.behavioral.command.example.invoker.GameSettings;
import com.behavioral.command.example.receiver.Game;
import com.behavioral.showcase.Pattern;

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

        ArrayList<com.behavioral.command.example.commands.Command> commands = new ArrayList<>();
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
