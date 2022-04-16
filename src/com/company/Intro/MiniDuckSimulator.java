package com.company.Intro;

import com.company.Intro.Duck;
import com.company.Intro.FlyRocketPowered;
import com.company.Intro.MallardDuck;
import com.company.Intro.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
