package com.bashl.lombok;

import lombok.*;

@Data(staticConstructor = "offf")
public class DataExample {
    private final String name;
    @Setter(AccessLevel.PROTECTED) private int age;
    private final double score;
    private String[] tags;




//    @ToString(includeFieldNames=true)
    @Data(staticConstructor="of")
    public static class Exercise<T> {
        private final String name;
        private final T value;

        @lombok.experimental.Tolerate
        public Exercise(String name, T value) {
            this.name = name;
            this.value = value;
        }
    }


}
