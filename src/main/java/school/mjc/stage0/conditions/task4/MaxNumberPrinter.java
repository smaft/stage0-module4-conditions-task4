package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int Max = (first > second) ? (first > third ? first:third) : (second > third ? second: third);
        System.out.println(Max);
    }
}
