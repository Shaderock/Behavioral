package com.structural.observer.subscribers;

import com.structural.observer.subscriber_interface.OnLevelLoadListener;

public class LevelGUI implements GUI, OnLevelLoadListener
{
    @Override
    public void load()
    {
        System.out.println("Loading level GUI...");
        System.out.println("Level GUI loaded");
    }

    @Override
    public void onLoad()
    {
        load();
    }
}
