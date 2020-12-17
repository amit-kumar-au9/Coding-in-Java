class PatternsNumber {
    public static void main(String[] args) {
        int row = 3;
        int num = 1;
        for (int i = 1; i <= row; i++) {
            int str = 1;
            for (int j = 1; j <= num; j++) {
                System.out.print(str + "");
                str++;
            }
            System.out.println();
            num++;
        }
    }
}