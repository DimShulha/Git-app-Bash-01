public class Main {
    static int a = 4;
    static int b = 2;

    public static void main(String[] args) {
        System.out.println("My git app.");

        int d = divide(a,b);
        System.out.println(d);
    }

    private static int divide(int a, int b){
        return a / b;
    }
}