package my.oop;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Movable carMovable = car;
        Breakable carBreakable = car;

        carMovable.move();
        carBreakable.doBreak();

        Movable bicycleMove = new Bicycle();
        bicycleMove.move();

        bicycleMove = car;
        bicycleMove.move();

        Bicycle myBicycle = new Bicycle();
        myBicycle.move();
        myBicycle.stop();

        /*Machine machine = new Bicycle();
        machine.work();
        Machine machine1 = new Car();
        machine1.work();*/

        Machine[] machines = {new Car(), new Bicycle()};
        for (Machine m : machines) {
            m.work();
        }
    }
}
