package com.company.DecoratorPattern;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    public abstract String getDescription();
}
