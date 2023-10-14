package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {
        DigitsSum ds = new DigitsSum();
        ds.printDigitsSum(123456789);
    }
    public void printDigitsSum(int t) {
        String num = Integer.toString(t);
        int sum = 0;

        for (int i = 1; i <= num.length(); i++) {
            int digit = 0;
            digit = (t % 10);
            sum += digit;
            t /= 10;
        }
        System.out.println(sum);
    }
}
