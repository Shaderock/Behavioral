package com.structural.iterator;

import com.structural.iterator.example.CharacterIterator;
import com.structural.iterator.example.games.RPG;
import com.structural.iterator.example.games.Character;
import com.structural.iterator.example.games.Shooter;
import com.structural.showcase.Pattern;

public class Iterator extends Pattern
{
    public Iterator(String name)
    {
        super(name);
    }

    @Override
    public void demonstrate()
    {
        RPG rpg = new RPG();
        rpg.addCharacter(new Character("warrior"));
        rpg.addCharacter(new Character("archer"));

        CharacterIterator iterator = rpg.createIterator();
        System.out.println("RPG characters:");
        while (iterator.hasMore())
        {
            System.out.println(iterator.getNext().getName());
        }

        Shooter shooter = new Shooter();
        shooter.addCharacter(new Character("gunner"));
        shooter.addCharacter(new Character("machine-gunner"));

        iterator = shooter.createIterator();
        System.out.println("Shooter characters:");
        while (iterator.hasMore())
        {
            System.out.println(iterator.getNext().getName());
        }
    }
}
