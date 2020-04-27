package com.structural.strategy_and_template_method.template_method;

import com.structural.strategy_and_template_method.strategy.Action;

public class Platformer extends Action
{
    @Override
    public void runGame()
    {
        System.out.println("Game requires an accurate eye: " + this.isRequiredAccurateEye());
        System.out.println("Platformer is running");
    }
}
