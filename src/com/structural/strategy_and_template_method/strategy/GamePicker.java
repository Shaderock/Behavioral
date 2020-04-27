package com.structural.strategy_and_template_method.strategy;

import com.structural.strategy_and_template_method.template_method.FlightSimulator;
import com.structural.strategy_and_template_method.template_method.LifeSimulator;
import com.structural.strategy_and_template_method.template_method.Platformer;
import com.structural.strategy_and_template_method.template_method.Shooter;

public class GamePicker
{
    StrategyGame strategyGame;

    public void setStrategyGame(StrategyGame strategyGame)
    {
        this.strategyGame = strategyGame;
    }

    public void play(String chosenGame)
    {
        switch (chosenGame)
        {
            case "flight simulator":
                strategyGame = new FlightSimulator();
                break;
            case "life simulator":
                strategyGame = new LifeSimulator();
                break;
            case "platformer":
                strategyGame = new Platformer();
                break;
            default:
                strategyGame = new Shooter();
        }

        strategyGame.runGame();
    }
}
