package Q1;

public class CloneableSingleton implements Cloneable {
    private static CloneableSingleton instance = new CloneableSingleton();

    private CloneableSingleton() {}

    public static CloneableSingleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
