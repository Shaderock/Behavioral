package com.behavioral.strategy_and_template_method.template_method;

import com.behavioral.strategy_and_template_method.strategy.Simulator;

public class FlightSimulator extends Simulator
{
    @Override
    public void runGame()
    {
        System.out.println("Game is imitating something: " + this.isImitatingSomething());
        System.out.println("Flight simulator is running");
    }
}
