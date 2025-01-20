package Q1;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static SerializableSingleton instance = new SerializableSingleton();

    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
