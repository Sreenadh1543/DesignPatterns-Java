package com.dojo.kata;

class PersonBuilder {

    protected Person person = new Person();

    public PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
    }

    public Person build(){
        return person;
    }

}
