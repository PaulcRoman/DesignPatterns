package com.company.DecoratorPattern;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Dark Roast Coffee";
    }
    public double cost(){
        return .89;
    }

}
