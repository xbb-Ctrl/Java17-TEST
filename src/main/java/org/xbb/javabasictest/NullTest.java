package org.xbb.javabasictest;

import java.util.Objects;

public class NullTest
{
    public static void main(String[] args)
    {
        var p1 = new Person("ABC");
        System.out.println(p1.getName());
        var p2 = new Person();
        System.out.println(p2.getName());

        p1.setName("AB");
        p2.setName("CD");

        System.out.println(p2.getName());
    }
}


class Person {
    private String name;
    private static final String noName = "Unknown";

    public Person()
    {
        this.name = noName;
    }
    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (!Objects.equals(this.name, Person.noName))
        {
            System.out.println("You cannot change the name!");
        }
        else
        {
            this.name = name;
            System.out.println("The name for "+Person.this+" has been set!");
        }
    }

}

