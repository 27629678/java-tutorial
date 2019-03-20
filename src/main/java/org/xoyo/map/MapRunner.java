package org.xoyo.map;

import org.xoyo.TestingRunner;
import org.xoyo.base.DescriptionObject;
import sun.security.krb5.internal.crypto.Des;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}

public class MapRunner extends DescriptionObject implements TestingRunner {

    @Override
    public void run() {
        description();

        Map<String, List<String>> map = new HashMap<>();
        map.put("k", Collections.singletonList("o"));

        map.compute("k", (k, v) -> {
            return Collections.singletonList("n");
        });

        map.computeIfAbsent("null", (k) -> {
            return Collections.singletonList("null");
        });

        map.computeIfPresent("null", (k, v) -> {
            return Collections.singletonList("Null");
        });

        for (List<String> list: map.values()) {
            for (String msg: list) {
                System.out.println(msg);
            }
        }

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("a", 1));
        personList.add(new Person("b", 1));
        personList.add(new Person("c", 1));
        personList.add(new Person("d", 1));

        System.out.println(
        personList.stream().map(Person::getName).collect(Collectors.joining(">")));
    }
}
