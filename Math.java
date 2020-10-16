// import java.lang.Math; // Needed to use Math.round()

class Program {
    public static void main(String args[]) {
        double num1 = 74.65;
        System.out.println(Math.round(num1));

        float num2 = 1337.345523f;
        System.out.println(Math.round(num2));

        System.out.println(Math.ceil(num2));
        System.out.println(Math.floor(num2));
        System.out.println(Math.max(1, 2));

        double random = Math.random();
        System.out.println(random);

        double random2 = Math.random() * 100;
        System.out.println(random2);

        int random3 = (int) Math.round(Math.random() * 100);
        System.out.println(random3);

        int random4 = (int) (Math.random() * 100);
        System.out.println(random4);
    }
}