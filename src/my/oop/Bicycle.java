package my.oop;

public class Bicycle implements Movable{
    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }
    public void stop() {
        System.out.println("Bicycle stopped");
    }
}
