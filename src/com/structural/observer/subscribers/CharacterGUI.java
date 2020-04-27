package com.structural.observer.subscribers;

import com.structural.observer.subscriber_interface.OnLevelLoadListener;

public class CharacterGUI implements GUI, OnLevelLoadListener
{
    @Override
    public void load()
    {
        System.out.println("Loading character GUI...");
        System.out.println("Character GUI loaded");
    }

    @Override
    public void onLoad()
    {
        load();
    }
}
