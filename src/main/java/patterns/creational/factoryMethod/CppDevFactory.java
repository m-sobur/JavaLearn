package patterns.creational.factoryMethod;

public class CppDevFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
