package top.zgpv_10;

import java.util.LinkedList;

public class MyStack {
    private LinkedList link;

    public MyStack() {
        this.link = new LinkedList();
    }
    public void add(Object o) {
        this.link.push(o);
    }
    public Object get() {
        return this.link.pop();
    }
    public boolean isEmpty() {
        return this.link.isEmpty();
    }
}
