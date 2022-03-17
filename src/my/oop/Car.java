package my.oop;

public class Car extends Machine implements Movable, Breakable{
    @Override
    public void move() {
        System.out.println("Car is moving...");

    }

    @Override
    public void doBreak() {
        System.out.println("Car stopped");
    }

    @Override
    public void work() {
        System.out.println("Car is working");
    }
}
