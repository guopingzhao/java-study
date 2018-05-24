package top.zgpv_09;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.addElement('1');

        System.out.println(vector);

        System.out.println(vector.elementAt(0));

        Enumeration en = vector.elements();
        System.out.println(en.nextElement());
    }
}
