package com.structural.iterator.example.games;

import com.structural.iterator.example.Game;
import com.structural.iterator.example.CharacterIterator;
import com.structural.iterator.example.iterators.RPGIterator;

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
