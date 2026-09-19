package Homeworks_OOP;

public class Uchburchak_Task {
    private double a;
    private double b;
    private double c;

    public Uchburchak_Task(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = gipatenuza();
    }

    private double gipatenuza() {
        return Math.sqrt(a * a + b * b);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getYuzi() {
        return (a * b) / 2;
    }

    public double getPeremetr() {
        return a + b + c;
    }
}