package com.bashl.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EqualsAndHashCodeExample {
    private transient int transientVar = 10;
    @EqualsAndHashCode.Include private String name;
    @EqualsAndHashCode.Include  private double score;
    @EqualsAndHashCode.Exclude private Square square = new Square(5, 10);
    @EqualsAndHashCode.Include private String[] tags;
    @EqualsAndHashCode.Exclude private int id;

    public String getName() {
        return this.name;
    }

    @EqualsAndHashCode(callSuper=false)
    public static class Square {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
