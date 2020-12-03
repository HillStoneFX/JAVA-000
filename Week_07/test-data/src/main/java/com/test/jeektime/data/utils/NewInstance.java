package com.test.jeektime.data.utils;

import org.springframework.util.ClassUtils;

import java.util.Arrays;
import java.util.Map;


public class NewInstance {

    public static <T> T copyProperties(Map<String,Object> map, Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T obj = clazz.newInstance();
        Arrays.stream(clazz.getDeclaredFields()).forEach(field -> {
            boolean flag = field.isAccessible();
            if (!flag){
                field.setAccessible(true);
            }

            if (map.containsKey(field.getName())){
                try {
                    field.set(obj, map.get(field.getName()));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            field.setAccessible(flag);
        });


        return obj;
    }
}