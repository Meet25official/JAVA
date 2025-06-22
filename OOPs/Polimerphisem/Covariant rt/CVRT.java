class A {
    A get() {
        return this;
    }
}

class B extends A {
    @Override
    B get() {
        return this;
    }

    void message() {
        System.out.println("This is covariant return type");
    }
}


public class CVRT {
    public static void main(String[] args) {
        System.out.println(new B().get().getClass().getName());
        new B().get().message();
    }
}