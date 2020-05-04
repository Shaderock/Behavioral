package com.behavioral.iterator.example.games;

import com.behavioral.iterator.example.Game;
import com.behavioral.iterator.example.CharacterIterator;
import com.behavioral.iterator.example.iterators.RPGIterator;

import java.util.ArrayList;

public class RPG implements Game
{

    ArrayList<Character> characters;

    public RPG()
    {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character)
    {
        characters.add(character);
    }

    @Override
    public CharacterIterator createIterator()
    {
        return new RPGIterator(this);
    }

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }
}
