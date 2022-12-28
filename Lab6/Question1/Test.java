package Lab6.Question1;

public class Test {
    public static void main(String[] args) {
        MyPair<String, Integer> p1 = new MyPair<String, Integer>("Anders", 13);
        MyPair<String, Double> p2 = new MyPair<String, Double>("Phoenix", 39.7);

        MyPair<String, Integer>[] p3 = new MyPair[5];
        p3[0] = new MyPair<String, Integer>("Anders", 13);
        p3[1] = new MyPair<String, Integer>("Phoenix", 39);
        p3[2] = new MyPair<String, Integer>("Bjorn", 12);

        String[] grades = new String[3];
        for (int i = 0; i < 3; i++) {
            grades[i] = p3[i].toString();
        }
        for (String s : grades) {
            //System.out.println(s);
        }

        MyPair<MyPair<Integer, Integer>, String> appointment = new MyPair<MyPair<Integer, Integer>, String>(
                                                                new MyPair<Integer, Integer>(12, 30), "Dentist");
        //System.out.println(appointment.Fst.Snd);

        System.out.println(p1.swap());
    }

}
