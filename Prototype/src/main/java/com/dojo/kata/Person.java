package com.dojo.kata;

import java.io.Serializable;

class Person implements Serializable
{
    public int stuff;
    public String whatever;

    public Person(int stuff, String whatever)
    {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "stuff {"+stuff+"}"+
                "whatever{"+whatever+"}"+
                "}";


    }
}
