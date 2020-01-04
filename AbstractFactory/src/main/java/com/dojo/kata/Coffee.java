package com.dojo.kata;

class Coffee implements HotDrink
{
    @Override
    public void consume()
    {
        System.out.println("This coffee is delicious");
    }
}