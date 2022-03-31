package my.nested;

public class OuterWithLocalInner {

    public void buildLocalInner() {

        class LocalInner {
            public LocalInner() {
                System.out.println("Hello from LocalInner");
            }
        }

        LocalInner localInner = new LocalInner();
    }

    public static void main(String[] args) {
        new OuterWithLocalInner().buildLocalInner();
    }

}
