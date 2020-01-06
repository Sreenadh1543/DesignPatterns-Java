package com.dojo.kata;

import org.apache.commons.lang3.SerializationUtils;

class CopyThroughSerializationDemo
{
    public static void main(String[] args)
    {
        Person p1 = new Person(42, "life");

        Person p2 = SerializationUtils.roundtrip(p1);

        p2.whatever = "xyz";

        System.out.println(p1);
        System.out.println(p2);
    }
}
