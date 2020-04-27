package com.structural.strategy_and_template_method;

import com.structural.showcase.Pattern;
import com.structural.strategy_and_template_method.strategy.GamePicker;

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
