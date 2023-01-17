package functionalprogramming.chapter02.java;

public class Box<T> {
    protected T ob;
    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}
