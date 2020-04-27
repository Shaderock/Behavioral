package com.structural;

import com.structural.command.Command;
import com.structural.iterator.Iterator;
import com.structural.observer.Observer;
import com.structural.showcase.Pattern;
import com.structural.showcase.PatternDemonstrator;
import com.structural.strategy_and_template_method.StrategyTemplateMethod;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        showCase();
    }

    public static void showCase()
    {
        PatternDemonstrator patternDemonstrator = new PatternDemonstrator();
        ArrayList<Pattern> patterns = new ArrayList<>();

        patterns.add(new StrategyTemplateMethod("Strategy + Template Method"));
        patterns.add(new Iterator("Iterator"));
        patterns.add(new Observer("Observer"));
        patterns.add(new Command("Command"));

        for (Pattern pattern : patterns)
        {
            patternDemonstrator.setPattern(pattern);
            patternDemonstrator.demonstrate();
        }
    }
}
