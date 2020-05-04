package com.behavioral.strategy_and_template_method;

import com.behavioral.showcase.Pattern;
import com.behavioral.strategy_and_template_method.strategy.GamePicker;

public class StrategyTemplateMethod extends Pattern
{
    public StrategyTemplateMethod(String name)
    {
        super(name);
    }

    @Override
    public void demonstrate()
    {
        GamePicker gamePicker = new GamePicker();
        gamePicker.play("platformer");
        System.out.println();
        gamePicker.play("life simulator");
    }
}
