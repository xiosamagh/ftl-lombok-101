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
    }


}


