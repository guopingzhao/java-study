package top.zgpv_12;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("1");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.remove("2");
        hashSet.contains("2");
        System.out.println(hashSet);


        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("a", 16));
        treeSet.add(new Student("b", 13));
        treeSet.add(new Student("c", 24));
        treeSet.add(new Student("t", 53));
        treeSet.add(new Student("h", 12));
        treeSet.add(new Student("s", 14));

        System.out.println(treeSet);

        System.out.println("------------------------");

        TreeSet<Student> treeSet1 = new TreeSet<>(Comparator.comparingInt(Student::getAge));
        treeSet1.add(new Student("a", 16));
        treeSet1.add(new Student("b", 13));
        treeSet1.add(new Student("c", 24));
        treeSet1.add(new Student("t", 53));
        treeSet1.add(new Student("h", 12));
        treeSet1.add(new Student("s", 14));


        System.out.println(treeSet1);
        test1();

    }
    public static void test() {
        System.out.println("test");
    }
    public static void test1() {
        Runnable test1 = SetDemo::test;
        Runnable test2 = () -> System.out.println("11111");
        test1.run();
        test2.run();
    }
}
