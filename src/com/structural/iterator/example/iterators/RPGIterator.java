package com.structural.iterator.example.iterators;



import com.structural.iterator.example.games.Character;
import com.structural.iterator.example.games.RPG;

import java.util.ArrayList;

public class RPGIterator implements com.structural.iterator.example.CharacterIterator
{

    RPG rpg;
    int currentPosition;
    ArrayList<Character> characters;

    public RPGIterator(RPG rpg)
    {
        this.rpg = rpg;
        currentPosition = 0;
        characters = rpg.getCharacters();
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
