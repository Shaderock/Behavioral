package com.behavioral;

import com.behavioral.command.Command;
import com.behavioral.iterator.Iterator;
import com.behavioral.observer.Observer;
import com.behavioral.showcase.Pattern;
import com.behavioral.showcase.PatternDemonstrator;
import com.behavioral.strategy_and_template_method.StrategyTemplateMethod;

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
