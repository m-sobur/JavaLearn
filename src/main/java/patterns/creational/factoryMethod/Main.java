package patterns.creational.factoryMethod;

// TODO: 30/10/2023 ЦЕЛЬ: Создание интерфейса, который создаёт объект.
// TODO: При этом, выбор того, экземпляр какого класса создавать остаётся за классами,
//  которые имплементируют данный интерфейс.

// TODO: 30/10/2023 Для чего используется:
// TODO: Для делигирования создания экземпляров, другому классу.

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createSpecialDeveloperFactory("c++");

        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createSpecialDeveloperFactory(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDevFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDevFactory();
        } else {
            throw new RuntimeException(specialty + " incorrect type for creating DeveloperFactory");
        }
    }
}
