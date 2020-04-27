package com.structural.showcase;

public abstract class Pattern
{
    private String name;

    public Pattern()
    {
    }

    public Pattern(String name)
    {
        this.name = name;
    }

    public abstract void demonstrate();

    public String getName()
    {
        return name;
    }
}
