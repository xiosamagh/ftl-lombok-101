package com.bashl.lombok;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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




        ValueExample valueExample = new ValueExample("cons",25,2.3,new String[]{"112","113"});

        System.out.println(valueExample);
        System.out.println(valueExample.getAge());

        Set<String> set1 = new HashSet<>();
        BuilderExample bld1 = new BuilderExample(12,"bld1",25,set1);

        System.out.println(bld1);

        BuilderExample bld2 = BuilderExample.builder().created(125).name("bld2").age(125).build();

        System.out.println(bld2);


        SynchronizedExample synchronizedExample = new SynchronizedExample();

        System.out.println(synchronizedExample.answerToLife());
        synchronizedExample.foo();
        SynchronizedExample.hello();

        WithExample withExample = new WithExample("name", 12);
        WithExample withExample1 = withExample.withName("scp").withAge(155);
        System.out.println(withExample);

        System.out.println(withExample1);

        GetterLazyExample getterLazyExample = new GetterLazyExample();
        System.out.println(Arrays.toString(getterLazyExample.getCached()));







    }


}


