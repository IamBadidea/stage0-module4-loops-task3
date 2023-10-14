package school.mjc.stage0.loops.task3;

public class NinesSum {

    public static void main(String[] args) {
        NinesSum ns = new NinesSum();
        ns.calculateSum(4);

    }
    public void calculateSum(int lengthOfLastNumber) {
        String number = "";
        int sum = 0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            number += "9";
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }



}
