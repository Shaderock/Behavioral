package com.structural.observer;

import com.structural.observer.publisher.LevelLoader;
import com.structural.observer.subscribers.CharacterGUI;
import com.structural.observer.subscribers.LevelGUI;
import com.structural.observer.subscribers.MenuGUI;
import com.structural.showcase.Pattern;

public class Observer extends Pattern
{
    public Observer(String name)
    {
        super(name);
    }

    @Override
    public void demonstrate()
    {
        LevelLoader levelLoader = new LevelLoader();
        levelLoader.addOnLoadListener(new CharacterGUI());
        levelLoader.addOnLoadListener(new MenuGUI());
        levelLoader.addOnLoadListener(new LevelGUI());

        levelLoader.run();
    }
}
