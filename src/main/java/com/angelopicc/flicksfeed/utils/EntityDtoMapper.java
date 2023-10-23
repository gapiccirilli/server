package com.angelopicc.flicksfeed.utils;

import java.lang.reflect.Field;

public class EntityDtoMapper<T1, T2> {

    public T2 map(T1 mappedFrom, T2 mappedTo) throws IllegalArgumentException, IllegalAccessException {
        Field[] t1Fields = mappedFrom.getClass().getDeclaredFields();
        Field[] t2Fields = mappedFrom.getClass().getDeclaredFields();
        return constructObj(t1Fields, t2Fields, mappedFrom, mappedTo);
    }

    private T2 constructObj(Field[] fields1, Field[] fields2, T1 mappedFrom, T2 mappedTo) throws IllegalArgumentException, IllegalAccessException {
        
        for(Field field1 : fields1) {
            for(Field field2 : fields2) {
                if (field1.getName().equals(field2.getName()) && field1.getType().getName().equals(field2.getType().getName())) {
                    field1.setAccessible(true);
                    field2.setAccessible(true);
                    field2.set(mappedTo, field1.get(mappedFrom));
                }
            }
        }
        return mappedTo;
    }
}
