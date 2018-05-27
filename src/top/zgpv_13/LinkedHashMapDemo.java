package top.zgpv_13;

import top.zgpv_12.Student;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> l = new LinkedHashMap<>();
        l.put("a", "a");
        l.put("2", "2");
        l.put("1", "1");

        System.out.println(l);

        l.forEach((a, b) -> System.out.println(a + "----" + b));

        TreeMap<Student, Integer> tm = new TreeMap<>(Comparator.comparingInt(Student::getAge));

        tm.put(new Student("a", 2), 2);
        tm.put(new Student("b", 1), 1);

        System.out.println(tm);
    }
}
