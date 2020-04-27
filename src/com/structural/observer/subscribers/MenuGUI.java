package com.structural.observer.subscribers;

import com.structural.observer.subscriber_interface.OnLevelLoadListener;

public class MenuGUI implements GUI, OnLevelLoadListener
{
    @Override
    public void load()
    {
        System.out.println("Loading menu GUI...");
        System.out.println("Menu GUI loaded");
    }

    @Override
    public void onLoad()
    {
        load();
    }
}
