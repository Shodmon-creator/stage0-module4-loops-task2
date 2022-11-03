package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 1;
        int factorial = 1;
        if (printToInclusive != 0) {
            while (number <= printToInclusive) {
                factorial *= number;
                number++;
                System.out.println(factorial);
            }
        } else {
            System.out.println(1);
        }


    }
}
