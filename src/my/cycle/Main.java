package my.cycle;

public class Main {

    static void tryWhile() {
        int i = 1;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }

    static void tryDoWhile() {
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }

    static void tryFor() {
        for (int i = 1; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }

    static double average(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0.0;
        long sum = 0;
        for(int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
            if ( Long.MAX_VALUE - sum < numbers[index]) {
                sum += numbers[index];
            } else {
                System.out.println("Error out of bound");
            }

        }
        System.out.println("sum = " + sum);
        double result = (double) sum / numbers.length;
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2};
        System.out.println(average(test1));

        int[] test2 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] test3 = new int[24];
        test3[1] = 12;
        System.out.println(average(null));
    }
}