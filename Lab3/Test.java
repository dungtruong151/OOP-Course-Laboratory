package Lab3;

import java.nio.charset.MalformedInputException;

public class Test {
    public class A{
        public A(){
            System.out.println("A");
        }
    }
    public class B extends A{
        public B(){
            System.out.println("B");
        }
    }
    public class C extends B{
        public C(){
            System.out.println("C");
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        C c = test.new C();

    }
}
