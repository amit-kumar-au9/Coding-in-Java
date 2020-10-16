public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting
        short x = 1;
        int y = x + 2; // Implicit Casting -> x is automatically type cast to int
        System.out.println(y);

        int m = 45;
        double n = m + 5.3; // Implicit Casting -> m is automatically type cast to double
        System.out.println(n);

        // Explicit Casting
        String a = "1";
        int b = Integer.parseInt(a) + 5;
        System.out.println(b);

        String c = "1.2";
        double d = Double.parseDouble(c) + 5.6;
        System.out.println(d);

    }
}
