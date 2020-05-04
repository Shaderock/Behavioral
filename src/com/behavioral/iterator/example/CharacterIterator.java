package com.behavioral.iterator.example;

import com.behavioral.iterator.example.games.Character;

public interface CharacterIterator
{
    Character getNext();
    boolean hasMore();
}
