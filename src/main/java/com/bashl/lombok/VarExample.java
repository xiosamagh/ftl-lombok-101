package com.bashl.lombok;

import lombok.var;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VarExample {
    public String example() {
        Random random = new Random();
        var foo = "Случайное число:";
        foo = foo + random.nextInt(25);
        return foo;
    }

}
