package top.zgpv_10;

import top.zgpv_09.Student;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student("a", 1));
        for (Student s : array) {
            s.showAge();
            s.showName();
        }

        System.out.println("------------------------");

        ObjectTool<String> objectTool = new ObjectTool<>();

        objectTool.setObj("1");

        String s = objectTool.getObj();

        System.out.println(s);

        System.out.println("------------------------");

        objectTool.show("hello");
        objectTool.show(100);
        objectTool.show(true);

    }
}
