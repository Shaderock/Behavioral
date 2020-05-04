package com.behavioral.strategy_and_template_method.template_method;

import com.behavioral.strategy_and_template_method.strategy.Action;

public class Shooter extends Action
{
    @Override
    public void runGame()
    {
        System.out.println("Game requires an accurate eye: " + this.isRequiredAccurateEye());
        System.out.println("Shooter is running");
    }
}
