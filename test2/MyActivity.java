package test.myapplicationtest.test2;

public class MyActivity implements MyInterface {

    public void eat() {
        System.out.println("Eat");
    }

    public void work() {
        System.out.println("Work");
    }

    public void swim()  {
        System.out.println("Swim");
    }

    public static void main(String args[]) {
        MyActivity myActivity = new MyActivity();
        myActivity.eat();
        myActivity.work();
        myActivity.swim();
    }
}
