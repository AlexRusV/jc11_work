package my.oop;

public class Car implements Movable, Breakable{
    @Override
    public void move() {
        System.out.println("Car is moving...");

    }

    @Override
    public void doBreak() {
        System.out.println("Car stopped");
    }
}
