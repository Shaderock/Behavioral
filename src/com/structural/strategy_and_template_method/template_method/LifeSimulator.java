package com.structural.strategy_and_template_method.template_method;

import com.structural.strategy_and_template_method.strategy.Simulator;

public class LifeSimulator extends Simulator
{
    @Override
    public void runGame()
    {
        System.out.println("Game is imitating something: " + this.isImitatingSomething());
        System.out.println("Life simulator is running");
    }
}
