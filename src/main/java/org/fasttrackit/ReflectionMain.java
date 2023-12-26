package org.fasttrackit;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car();
        car.setName("BMW");
        System.out.println(car.getName());

        Field name = Car.class.getDeclaredField("name");
        name.setAccessible(true);
        name.set(car,"test");

        System.out.println(car.getName());
        System.out.println(Arrays.toString(Car.class.getAnnotations()));
    }
}
