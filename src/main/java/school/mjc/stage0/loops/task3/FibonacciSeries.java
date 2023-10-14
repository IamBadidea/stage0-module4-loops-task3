package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        fs.printFibonacci(6);
    }
    public void printFibonacci(int lastFibonacci) {
        int sum = 0;

        int zero = 0;
        int first = 0;
        int current = 0;

        for (int i = 0; i <= lastFibonacci; i++) {
            if (i == 0) {
                zero += i;
                System.out.println(zero);
                continue;
            }

            if (i == 1) {
                first += i;
                System.out.println(first);
                continue;
            }

            current = zero + first;
            System.out.println(current);
            zero = first;
            first = current;


        }
    }
}
