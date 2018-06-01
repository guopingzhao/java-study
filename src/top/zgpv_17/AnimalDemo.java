package top.zgpv_17;

/**
 * 工厂模式
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.create("dog");
        dog.eat();

        Animal cat = AnimalFactory.create("cat");
        cat.eat();
    }
}
