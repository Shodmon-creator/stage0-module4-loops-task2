package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power<0){
            System.out.println("too much power");
        }else {
            System.out.println(Math.pow(2,power));
        }
    }
}
