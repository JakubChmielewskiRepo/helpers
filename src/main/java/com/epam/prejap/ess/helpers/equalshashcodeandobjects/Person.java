package com.epam.prejap.ess.helpers.equalshashcodeandobjects;


    class Person {

    private String name;
    private String surmane;

    Person(String name, String surmane) {
        this.name = name;
        this.surmane = surmane;
    }

    Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surmane.equals(person.surmane);
    }
}
