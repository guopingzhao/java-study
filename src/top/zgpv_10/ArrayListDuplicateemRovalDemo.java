package top.zgpv_10;

import top.zgpv_09.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDuplicateemRovalDemo {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(9);

        ArrayList arr2 = new ArrayList();
        arr2.add(new Student("小子", 20));
        arr2.add(new Student("女子", 18));
        arr2.add(new Student("小子", 20));

        System.out.println(duplicateemRoval(arr));
        System.out.println(duplicateemRoval(arr2));

    }
    public static ArrayList duplicateemRoval(ArrayList arr) {
        ArrayList nArr = new ArrayList();

        for(Iterator it = arr.iterator(); it.hasNext(); ) {
            Object o = it.next();

            if(!nArr.contains(o)){
                nArr.add(o);
            }
        }

        return nArr;
    }
}
