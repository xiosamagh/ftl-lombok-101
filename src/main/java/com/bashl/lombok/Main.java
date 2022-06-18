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

        EqualsAndHashCodeExample equalsAndHashCodeExample = new EqualsAndHashCodeExample();
        equalsAndHashCodeExample.setName("dwdq");
        System.out.println(equalsAndHashCodeExample.hashCode());


        ConstructorExample constructorExample = new ConstructorExample(1,2,"dddd");

        ConstructorExample.NoArgsExample crs = new ConstructorExample.NoArgsExample();


        DataExample dataExample = DataExample.offf("ddw",2.5);

        DataExample.Exercise dt = DataExample.Exercise.of("IVAN", "DWQ");

        dataExample.setAge(254);

        System.out.println(dt);

        DataExample.Exercise dt1 = DataExample.Exercise.of("DW",2.4);

        DataExample.Exercise dt2 = DataExample.Exercise.of("ARTEM", 3.1);

        System.out.println(dt1.hashCode());


    }


}


