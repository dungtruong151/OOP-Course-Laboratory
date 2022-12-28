package Lab6.Question2;

public class Test {
    public static void main(String[] args) {
        MyMapObject m = new MyMapObject(new Object[] { 13, 39, 12 } ,new Object[] { "Anders", "Phoenix", "Bjorn" });
        // System.out.println(m.get(13));
        // Object o = "Dung";
        // m.put(15, o);
        // System.out.println(m.get(15));

        // Object o2 = 100;
        // m.put(16, o2);
        // System.out.println(m.get(16));
        
        m.put(15, 159.63);
        System.out.println(m.get(15));

        MyMapGeneric<Integer, String> m2 = new MyMapGeneric<Integer, String>(new Integer[] { 13, 39, 12 } ,new String[] { "Anders", "Phoenix", "Bjorn" });
        // System.out.println(m2.get(13));
        // String s = "Dung";
        // m2.put(15, s);
        // System.out.println(m2.get(15));

        // Integer i = 100;
        // m2.put(16, i.toString());
        // System.out.println(m2.get(16));
        m2.put(15, 159.63);
        System.out.println(m2.get(15));
    }
    
}
