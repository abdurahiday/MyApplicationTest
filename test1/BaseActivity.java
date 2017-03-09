package test.myapplicationtest.test1;

public abstract class BaseActivity {

    int c;

    public void addition(int a, int b) {
        c = a + b;
        System.out.println(c);
    }

    protected void subtraction(int a, int b) {
        c = a - b;
        System.out.println(c);
    }

    public abstract void sample();

    public static void main(String args[]) {
        int a = 10, b = 20;
        BaseActivity base = new BaseActivity() {
            @Override
            public void sample() {

            }

        };
        base.addition(a, b);
    }
}
