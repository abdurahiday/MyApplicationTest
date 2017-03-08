package test.myapplicationtest.test2;

public class MyActivity implements MyInterface {

    public void eat() {
        System.out.println("Eat");
    }

    public void sleep() {
        System.out.println("Sleep");
    }

    public void work()  {
        System.out.println("Work");
    }

    public static void main(String args[]) {
        MyActivity myActivity = new MyActivity();
        myActivity.eat();
        myActivity.sleep();
        myActivity.work();
    }
}
