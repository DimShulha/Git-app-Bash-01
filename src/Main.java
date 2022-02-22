
public class Main {

    public static void main(String[] args) {

        System.out.println("My git app.");
        int a = 4;
        int b = 2;
        int d = divide(a, b);
        System.out.println(d);
        deleTed();
    }

    private static void deleTed(){
        StringBuffer s = new StringBuffer("My git app.");
        s.delete(0,10);
        System.out.println(s);
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
