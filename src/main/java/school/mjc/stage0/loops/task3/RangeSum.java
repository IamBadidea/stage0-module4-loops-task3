package school.mjc.stage0.loops.task3;

public class RangeSum {

    public static void main(String[] args) {
        RangeSum rs = new RangeSum();
        rs.printSumInclusive(1,4);
    }
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int summ = 0;

        for (int i = firstBoarder + 1; i < secondBoarder; i++) {
            summ += i;
        }

        System.out.println(summ);
    }
}
