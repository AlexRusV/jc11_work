package my.nested;

public class OuterWithNested {
    public OuterWithNested() {
        System.out.println("Hello from Nested");
    }

    public Nested createNested() {
        return new Nested();

    }

    //This is inner (nested) class
    class Nested {
        public Nested() {
            System.out.println("Hello from Nested");
        }
    }
        public void getNested(Nested nested) {
            System.out.println(nested);
        }

        public static void main(String[] args) {
            Nested nested = new OuterWithNested().createNested();
            //Nested nested1 = new Nested();
            Nested2 nested2 = new Nested2();
        }

    static class Nested2 {
    }
}