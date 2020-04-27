package com.structural.showcase;

public class PatternDemonstrator
{
    private Pattern pattern;

    public PatternDemonstrator()
    {
    }

    public void demonstrate()
    {
        System.out.println("==========================================");

        System.out.println(pattern.getName());
        System.out.println("__________________________________________");
        pattern.demonstrate();

        System.out.println("==========================================");
    }

    public void setPattern(Pattern pattern)
    {
        this.pattern = pattern;
    }
}
