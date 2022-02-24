public class Hello {
	public static void main(String[] args) {
			System.out.println("Hello World" + args[0]);
			Car myCar;
			myCar = new Car();
			System.out.println(myCar.price);
			System.out.println(myCar.model);
        System.out.println(myCar.getModel());
	}
}
class Car {
    int price;
    String model;

    public int getPrice(){
        return price;
    }
    public void setPrice(int newPrice){

    }
    public String getModel() {
        return model;
    }
}
