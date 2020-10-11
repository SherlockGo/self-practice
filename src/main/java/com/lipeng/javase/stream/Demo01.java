package com.lipeng.javase.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo01 {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Luban", 18, "男"));
        personList.add(new Person("Arthur", 25, "男"));
        personList.add(new Person("Angel", 16, "女"));
        personList.add(new Person("Chengyaojin", 27, "男"));

//        System.out.println(personList);

        List<String> list = personList.stream()
                .filter(person -> person.getGender().equals("男"))
                .map(Person::getName).collect(Collectors.toList());

        System.out.println(list);


    }

}
