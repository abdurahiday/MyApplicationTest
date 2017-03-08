package test.myapplicationtest.test1;

abstract class BaseActivity {

    int c;

    public void addition(int a, int b) {
        c = a + b;
        System.out.println(c);
    }

    protected void subtraction(int a, int b) {
        c = a - b;
        System.out.println(c);
    }

    public void sample() {

    }
}
