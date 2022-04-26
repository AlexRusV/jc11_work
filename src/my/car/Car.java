package my.car;

public abstract class Car {
    private CarType model;

    Car(){}

    public Car(CarType model) {
        this.model = model;
    }

    public CarType getModel() {
        return model;
    }

    public void setModel (CarType model) {
        this.model = model;
    }
    abstract void construct();
}
