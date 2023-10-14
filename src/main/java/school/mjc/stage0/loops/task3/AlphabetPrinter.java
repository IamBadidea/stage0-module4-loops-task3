package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public static void main(String[] args) {
        AlphabetPrinter ap = new AlphabetPrinter();
        ap.printAlphabet();
    }
    public void printAlphabet() {
                for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }
    }
}
