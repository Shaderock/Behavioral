package com.behavioral.strategy_and_template_method.strategy;

public abstract class Action implements StrategyGame
{
    public boolean isRequiredAccurateEye()
    {
        return true;
    }
}
