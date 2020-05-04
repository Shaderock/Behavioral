package com.behavioral.iterator.example.iterators;

import com.behavioral.iterator.example.CharacterIterator;
import com.behavioral.iterator.example.games.Shooter;
import com.behavioral.iterator.example.games.Character;

import java.util.ArrayList;

public class ShooterIterator implements CharacterIterator
{

    Shooter shooter;
    int currentPosition;
    ArrayList<Character> characters;

    public ShooterIterator(Shooter shooter)
    {
        this.shooter = shooter;
        currentPosition = 0;
        characters = shooter.getCharacters();
    }

    @Override
    public Character getNext()
    {
        return characters.get(currentPosition++);
    }

    @Override
    public boolean hasMore()
    {
        return currentPosition < characters.size();
    }
}
