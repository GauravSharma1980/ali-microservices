package com.food.ordering.system.domain.valueObject;

public class BaseId<T> {
    protected final T value;
    public BaseId(T value){
        this.value = value;
    }
    public T getValue()
    {
        return value;
    }
}
