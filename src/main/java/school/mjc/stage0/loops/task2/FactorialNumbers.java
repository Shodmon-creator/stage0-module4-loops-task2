package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number=0;
        int border;
        while (number<printToInclusive){
           border=number+1;
            System.out.println();
           while (number<border){
               System.out.print(number);
               number++;
           }
        }

    }
}
