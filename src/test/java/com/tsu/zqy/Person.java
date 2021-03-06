package com.tsu.zqy;

import org.springframework.stereotype.Component;

/**
 * @ClassName Person
 * @Author Elv1s
 * @Date 2018/12/5 12:53
 * @Description:
 */

@Component
public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person( int age,String name) {

        this(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
