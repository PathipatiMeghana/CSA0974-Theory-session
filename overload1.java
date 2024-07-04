public class Overload1 {

    void add(int a, int b) {
        int c = a + b;
        System.out.println("This is add(int a, int b): " + c);
    }

    void add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("This is add(int a, int b, int c): " + d);
    }

    public static void main(String[] args) {
        Overload1 o1 = new Overload1();
        o1.add(2, 3);      
        o1.add(2, 3, 4);   
    }
}

Output:
This is add(int a, int b): 5
This is add(int a, int b, int c): 9