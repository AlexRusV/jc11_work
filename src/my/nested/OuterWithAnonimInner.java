package my.nested;

public class OuterWithAnonimInner {

    public void buildAnonimInner() {
        getSomeInterface(new SomeInterface() {
            @Override
            public void doSomething() {
                System.out.println("Do something #1");
            }
        });
    }

    public void buildAnotherAnonimInner() {
        getSomeInterface(new SomeInterface() {
            @Override
            public void doSomething() {
                System.out.println("Another inner class implementation #2");
            }
        });
    }

    private void getSomeInterface(SomeInterface someInterface) {
        someInterface.doSomething();
    }

    public static void main(String[] args) {
        new OuterWithAnonimInner().buildAnonimInner();
        new OuterWithAnonimInner().buildAnotherAnonimInner();
    }
}

interface SomeInterface {
    void doSomething();
}
