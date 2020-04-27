package com.structural.command.example.receiver;

public class Game
{
    int soundVolume;
    int musicVolume;
    int maxFPS;

    public int getSoundVolume()
    {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume)
    {
        this.soundVolume = soundVolume;
    }

    public int getMusicVolume()
    {
        return musicVolume;
    }

    public void setMusicVolume(int musicVolume)
    {
        this.musicVolume = musicVolume;
    }

    public int getMaxFPS()
    {
        return maxFPS;
    }

    public void setMaxFPS(int maxFPS)
    {
        this.maxFPS = maxFPS;
    }
}
