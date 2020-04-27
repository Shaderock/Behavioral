package com.structural.iterator.example;

import com.structural.iterator.example.games.Character;

public interface CharacterIterator
{
    Character getNext();
    boolean hasMore();
}
