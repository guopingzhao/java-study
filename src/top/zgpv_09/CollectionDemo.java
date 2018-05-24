package top.zgpv_09;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");

        Collection arrayList1 = new ArrayList();
        arrayList1.add("2");
        arrayList1.add("3");

        System.out.println(arrayList.toString() + arrayList1);

//        arrayList.clear();
//        System.out.print(arrayList);

//        System.out.println(arrayList.remove("1"));
//        System.out.println(arrayList.remove("3"));

//        System.out.println(arrayList.contains("1"));
//        System.out.println(arrayList.contains("3"));

//        System.out.println(arrayList.isEmpty());
//        arrayList.clear();
//        System.out.println(arrayList.isEmpty());

//        System.out.println(arrayList.size());
//        System.out.println(arrayList.toArray());

//        System.out.println(arrayList.addAll(arrayList1));

//        System.out.println(arrayList.removeAll(arrayList1));  //一个成功就为true

//        System.out.println(arrayList.containsAll(arrayList1)); //所有成功才为true

//        System.out.println(arrayList.retainAll(arrayList1)); //返回只是否有变化

        for (Object v : arrayList) {
            System.out.print(v + ",");
            System.out.println(((String)v).length());
        }


        System.out.println(arrayList);
        System.out.println(arrayList1);


        System.out.println("----------------------");


        Collection studentCollection = new ArrayList();

        studentCollection.add(new Student("小子", 20));
        studentCollection.add(new Student("女子", 18));

        Object[] students = studentCollection.toArray();

        for (Object student : students) {
            Student s = (Student)student;
            System.out.println(s.getName() + "------" + s.getAge());
            s.showName();
            s.showAge();
        }

        System.out.println("----------------------");

        Iterator it = studentCollection.iterator();

        while (it.hasNext()) {
            Student s = (Student)it.next();
            System.out.println(s.getName() + "------" + s.getAge());
            s.showName();
            s.showAge();
        }

        System.out.println("----------------------");

        for (Iterator itr = studentCollection.iterator(); itr.hasNext();) {
            Student s = (Student)itr.next();
            System.out.println(s.getName() + "------" + s.getAge());
            s.showName();
            s.showAge();
        }

    }
}
