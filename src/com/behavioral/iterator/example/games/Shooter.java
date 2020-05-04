package com.behavioral.iterator.example.games;

import com.behavioral.iterator.example.Game;
import com.behavioral.iterator.example.CharacterIterator;
import com.behavioral.iterator.example.iterators.ShooterIterator;

import java.util.ArrayList;

public class Shooter implements Game
{

    ArrayList<Character> characters;

    public Shooter()
    {
        characters = new ArrayList<>();
    }

    public void addCharacter(Character character)
    {
        characters.add(character);
    }

    @Override
    public CharacterIterator createIterator()
    {
        return new ShooterIterator(this);
    }

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }
}
