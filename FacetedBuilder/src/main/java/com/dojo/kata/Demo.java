package com.dojo.kata;

public class Demo
{
    public static void main(String[] args){
        PersonBuilder pb = new PersonBuilder();
        Person person=pb.lives()
                        .at("Bohemia")
                        .in("Amsterdam")
                        .withPostCode("1000")
                        .build();
        System.out.println(person);
    }
}
