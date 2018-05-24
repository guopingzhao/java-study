package top.zgpv_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        list.add(2, "7");

        list.set(0, 0);

        System.out.println(list.get(3));

        System.out.println(list.indexOf("1"));

        System.out.println(list.remove(1));

        System.out.println(list);

        for (Iterator it = list.iterator(); it.hasNext(); ){
            System.out.println(it.next());
        }

        System.out.println("------------------------------");

        List l = new ArrayList();

        l.add(new Student("林青霞", 18));
        l.add(new Student("小子", 20));
        l.add(new Student("女子", 16));

        for (ListIterator lit = l.listIterator(); lit.hasNext();) {
            Student s = (Student)lit.next();
            s.showAge();
            s.showName();
        }

        System.out.println("------------------------------");

        for (int x = 0; x < l.size(); x++) {
            Student s = (Student)l.get(x);
            s.showName();
            s.showAge();
        }

        System.out.println("------------------------------");
        ListIterator lit = l.listIterator();
        for (; lit.hasNext();) {
            Student s = (Student)lit.next();
            if ("小子".equals(s.getName())) {
                lit.add(new Student("张三", 100));
            }
            s.showAge();
            s.showName();
        }
        for (; lit.hasPrevious();) {
            Student s = (Student)lit.previous();
            s.showAge();
            s.showName();
        }
    }
}
