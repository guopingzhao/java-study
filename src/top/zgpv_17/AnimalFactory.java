package top.zgpv_17;

public class AnimalFactory {
    private AnimalFactory(){}
    private static Dog createDog() {
        return new Dog();
    }
    private static Cat createCat() {
        return new Cat();
    }

    public static Animal create(String type) {
        if ("dog".equals(type)) {
            return createDog();
        } else if ("cat".equals(type)) {
            return createCat();
        } else {
            return null;
        }
    }
}
