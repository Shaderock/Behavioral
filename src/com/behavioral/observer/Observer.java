package com.behavioral.observer;

import com.behavioral.observer.publisher.LevelLoader;
import com.behavioral.observer.subscribers.CharacterGUI;
import com.behavioral.observer.subscribers.LevelGUI;
import com.behavioral.observer.subscribers.MenuGUI;
import com.behavioral.showcase.Pattern;

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
