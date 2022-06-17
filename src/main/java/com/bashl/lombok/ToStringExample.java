package com.bashl.lombok;

import lombok.ToString;

import java.awt.*;

@ToString(onlyExplicitlyIncluded = true)
public class ToStringExample {
    private static final int STATIC_VAR = 10;
    @ToString.Include(name = "surname", rank = 2) private String name;
    private Square square = new Square(5, 10);
    private String[] tags;
    @ToString.Exclude private int id;

    @ToString.Include(name = "method", rank = 11)public String getName() {
        return this.name;
    }

    @ToString(callSuper=true, includeFieldNames=true)
    public static class Square  {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
