package org.example.builder;

import lombok.Data;
import lombok.ToString;

/**
 * @author yuyou
 * @since 2022/6/16 22:12
 */
@ToString
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    private ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    @Data
    public static class Builder{
        private boolean isRef;
        private Class type;
        private Object arg;

        public ConstructorArg build(){
            if (isRef) {
                if (!(arg instanceof String)) {
                    throw new IllegalArgumentException("isRef is true arg must instanceof string");
                }
                if (type != null) {
                    throw new IllegalArgumentException("isRef is true type must be null");
                }
            } else {
                if (arg == null) {
                    throw new IllegalArgumentException("isRef is false arg must be not null");
                }
                if (type == null) {
                    throw new IllegalArgumentException("isRef is false type must be not null");
                }
            }
            return new ConstructorArg(this);
        }
    }
}
