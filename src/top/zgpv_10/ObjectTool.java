package top.zgpv_10;

public class ObjectTool<T> {
    private T obj;

    public ObjectTool() {
    }


    public ObjectTool(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public <E> void show(E e) {
        System.out.println(e);

    }
}
