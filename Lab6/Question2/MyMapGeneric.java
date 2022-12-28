package Lab6.Question2;

public class MyMapGeneric<T, U> {
    public T Key[];
    public U Value[];

    public MyMapGeneric(T key[], U value[]) {
        this.Key = key;
        this.Value = value;
    }

    public void put(T key, U value) {
        T tempKey[] = (T[]) new Object[Key.length + 1];
        U tempValue[] = (U[]) new Object[Value.length + 1];
        for (int i = 0; i < Key.length; i++) {
            tempKey[i] = Key[i];
            tempValue[i] = Value[i];
        }
        tempKey[Key.length] = key;
        tempValue[Value.length] = value;
        Key = tempKey;
        Value = tempValue;
        
    }

    public U get(T key) {
        for (int i = 0; i < Key.length; i++) {
            if (Key[i] == key) {
                return Value[i];
            }
        }
        return null;
    }
}
