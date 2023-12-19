package patterns.creational.factoryMethod;

public class JavaDevFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
