package main.java.practice.week4;

public class ChangeableMyClass extends NoChangeClass {

    @Override
    public int foo(int x) {
        int myValue = super.foo(2);

        System.out.println(myValue);
        return myValue;
    }
}
