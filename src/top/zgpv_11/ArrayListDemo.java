package top.zgpv_11;

import top.zgpv_09.Student;

import java.util.*;


public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Student> ary = new ArrayList<>();
        ary.add(new Student("A1", 12));
        ary.add(new Student("A2", 13));
        ary.add(new Student("A3", 14));

        ArrayList<Student> ary2 = new ArrayList<>();
        ary2.add(new Student("B1", 2));
        ary2.add(new Student("B2", 3));

        ArrayList<Student> ary3 = new ArrayList<>();
        ary3.add(new Student("C1", 22));

        ArrayList<ArrayList<Student>> arrayLists = new ArrayList<>();

        arrayLists.add(ary);
        arrayLists.add(ary2);
        arrayLists.add(ary3);

        for (ArrayList<Student> as : arrayLists) {
            for (Student s : as) {
                s.showAge();
                s.showName();
            }
        }

        ArrayList<Integer> fs = new ArrayList<>();
        Random r = new Random();

        while (fs.size() < 10) {
            Integer i = r.nextInt(20) + 1;
            if (!fs.contains(i)) {
                fs.add(i);
            }
        }

        System.out.println(fs);

        System.out.println("--------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入多个数字并用空格分隔：");
        String line = sc.nextLine();

        String[] nums = line.split("\\s+");

        System.out.println(max(nums));
    }

    public static <T> int max(T... c) {
        int max = Integer.MIN_VALUE;
        for (T s : c) {
            try {
                Integer i = Integer.valueOf(String.valueOf(s));
                if (i > max) {
                    max = i;
                }

            } catch (NumberFormatException e) {
                continue;
            }

        }
        return max;

    }
}
