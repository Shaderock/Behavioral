package com.structural.observer.publisher;

import com.structural.observer.subscriber_interface.OnLevelLoadListener;

import java.util.ArrayList;

public class LevelLoader implements Runnable
{
    ArrayList<OnLevelLoadListener> listeners;

    public LevelLoader()
    {
        listeners = new ArrayList<>();
    }

    public void addOnLoadListener(OnLevelLoadListener listener)
    {
        listeners.add(listener);
    }

    private void loadLevelData()
    {
        System.out.println("Loading level data...");
        try
        {
            Thread.sleep(1000);
            System.out.println("Level data loaded");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        loadLevelData();
        loadGUI();
    }

    private void loadGUI()
    {
        for (OnLevelLoadListener listener : listeners)
        {
            listener.onLoad();
        }
    }

}
