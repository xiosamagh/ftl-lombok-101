package com.bashl.lombok;





public class Main {
    public static void main(String[] args) {
        System.out.println("d");

        ValExample valExample = new ValExample();

        System.out.println(valExample.example());

        valExample.example2();


        VarExample varExample = new VarExample();
        System.out.println(varExample.example());

        Person person = new Person();
        person.setName("Ivan");
        NonNullExample nonNullExample = new NonNullExample(person);

        System.out.println(nonNullExample.getName());

        GetterSetterExample getterSetterExample = new GetterSetterExample();

        getterSetterExample.setAge(25);
        getterSetterExample.setAverageGrade(2.11);
        getterSetterExample.setName("Dota");

        System.out.println(getterSetterExample);

        ToStringExample toStringExample = new ToStringExample();

        System.out.println(toStringExample.toString());
    }


}


