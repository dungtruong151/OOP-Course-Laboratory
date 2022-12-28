package Lab6.Question2;

public class MyMapObject {
    public Object Key[];
    public Object Value[];

    public MyMapObject(Object key[], Object value[]) {
        this.Key = key;
        this.Value = value;
    }

    public void put(Object key, Object value) {
        Object tempKey[] = new Object[Key.length + 1];
        Object tempValue[] = new Object[Value.length + 1];
        for (int i = 0; i < Key.length; i++) {
            tempKey[i] = Key[i];
            tempValue[i] = Value[i];
        }
        tempKey[Key.length] = key;
        tempValue[Value.length] = value;
        Key = tempKey;
        Value = tempValue;
        
    }

    public Object get(Object key) {
        for (int i = 0; i < Key.length; i++) {
            if (Key[i] == key) {
                return Value[i];
            }
        }
        return null;
    }
}
