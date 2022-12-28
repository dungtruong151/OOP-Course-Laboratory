package Lab6.Question1;

public class MyPair<T, U> {
    public final T Fst; 
    public final U Snd; 
    public MyPair(T fst, U snd) { 
        this.Fst = fst; 
        this.Snd = snd; 
    } 
    public String toString() { 
        return "(" + Fst + ", " + Snd + ")"; 
    }

    public MyPair<U, T> swap() {
        MyPair<U, T> temp = new MyPair<U, T>(Snd, Fst);
        return temp;
    }
}
