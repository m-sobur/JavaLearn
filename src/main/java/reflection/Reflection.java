package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        // TODO: 15/11/2023
        //  Как создать обьект метаданных(класс рефлекции)? 3 способа:

        // TODO:
        //  1)
        Class<?> carClass = Class.forName("reflection.Car");

        // TODO:
        //  2)
        Class<Car> carClass1 = Car.class;

        // TODO:
        //  3)
        Car car = new Car();
        Class<?> carClass2 = car.getClass();

        System.out.println("-------------------------------------------------");
        Field model = carClass1.getField("model");
        System.out.println(model);
        System.out.println("-------------------------------------------------");

        System.out.println("-------------------------------------------------");
        Constructor<?>[] constructors = carClass1.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.toString());
        }
        System.out.println("-------------------------------------------------");

    }
}
