package com.dojo.kata;

class AbstractFactoryDemo
{
    public static void main(String[] args) throws Exception
    {
        HotDrinkMachine machine = new HotDrinkMachine();
        //HotDrink tea = machine.makeDrink(HotDrinkMachine.AvailableDrink.TEA, 200);
        //tea.consume();
        HotDrink drink = machine.makeDrink();
        drink.consume();
    }
}
