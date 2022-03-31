package my.nested;

public class OuterWithInnerStatic {

    static class InnerStatic {

    }

    public static void main(String[] args) {
        InnerStatic innerStatic = new OuterWithInnerStatic.InnerStatic();

    }
}
