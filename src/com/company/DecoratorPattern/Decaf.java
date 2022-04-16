package com.company.DecoratorPattern;

public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaf coffee";
    }
    public double cost(){
        return .89;
    }
}
