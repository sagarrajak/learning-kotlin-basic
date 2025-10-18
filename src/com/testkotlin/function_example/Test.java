package com.testkotlin.function_example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String s = JoinToStringKt.joinToString(
                List.of("sagar", "sunil", "bastard"),
                ",", "[", "]");

        String s1 = JoinToStringKt.joinToString(Set.of("kutta, billi"));
        char test = LastCharKt.lastChar("Test");
        System.out.println(s);
        System.out.println(test);
        Person person = new Person("Sagar", 12, "Jamshedpor");
        person.setAge(14);
    }
}
