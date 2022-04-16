package com.company.DecoratorPattern;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "Hose Blend Coffee";
    }
    public double cost() {
        return .89;
    }

}
