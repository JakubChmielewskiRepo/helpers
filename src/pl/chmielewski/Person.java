package pl.chmielewski;


public  class Person {

    String name;
    String surmane;

    public Person(String name, String surmane) {
        this.name = name;
        this.surmane = surmane;
    }

    public Person() {
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
