package top.zgpv_14;

import top.zgpv_12.Student;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> ss = Arrays.asList(2, 1, 4, 5, 3, 8, 0, 9);

//        Collections.sort(ss);

        System.out.println(ss);

        System.out.println(Collections.binarySearch(ss, 9));
        System.out.println(Collections.binarySearch(ss, 90));
        System.out.println(Collections.max(ss));
        System.out.println(Collections.min(ss));

//        Collections.reverse(ss);
        Random r = new Random(10);
        Collections.shuffle(ss, r);
        System.out.println(ss);

        Collections.shuffle(ss);
        System.out.println(ss);

        System.out.println("=================================");

        List<Student> sts = Arrays.asList(
                new Student("a", 1),
                new Student("f", 10),
                new Student("c", 6),
                new Student("d", 7),
                new Student("b", 4)
        );
        System.out.println(sts);

//        Collections.sort(sts); //重写compareTo
        Collections.sort(sts, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
//
        System.out.println(sts);
    }
}
