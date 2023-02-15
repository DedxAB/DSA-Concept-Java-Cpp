package arnab.DSA.ReferenceVariable;

class Myclass1 {
    int x = 10;
    int y = 20;

    public void display(Myclass1 a, Myclass1 b) {
        a.x = 19;
        b.y = 55;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

public class ReferenceVariableAsMethodParameter {
    public static void main(String[] args) {
        // Note--> Java only support pass by value
        Myclass1 rv1 = new Myclass1();
        Myclass1 rv2 = new Myclass1();
        rv1.display(rv1, rv2); // 19, 20
        rv2.display(rv1, rv2); // 10, 55
        System.out.println("value of x: " + rv1.x + ", y: " + rv1.y); // here as wel
        System.out.println("value of x: " + rv2.x + ", y: " + rv2.y); // here as wel
    }

}
