package com.dojo.kata;

class Person
{

    //address
    public String streetAddress,postcode,city;


    @Override
    public String toString(){
        return "Person{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                '}';
  }

}