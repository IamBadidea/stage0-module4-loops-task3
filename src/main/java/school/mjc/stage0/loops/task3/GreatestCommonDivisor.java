package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        gcd.printGCD(20, 12);

    }
    public void printGCD(int first, int second) {
        int GCD = 0;
        for (int i = 1; i < maxFromTwo(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                GCD = i;
            }
        }
        System.out.println(GCD);
    }

    private int maxFromTwo(int first, int second) {
        return first > second ? first : second;
    }
}
