package com.theo;

public class Person {

    private final String name;
    private final String vorname;
    private final Integer alter;

    public Person(final String name,final String vorname,final Integer alter) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public Integer getAlter() {
        return alter;
    }
}
