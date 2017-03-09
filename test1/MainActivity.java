package test.myapplicationtest.test1;

public class MainActivity extends BaseActivity {

    private void multiplication(int a, int b) {
        c = a * b;
        System.out.println(c);
    }

    public void sample() {
        System.out.println("Sample text");
    }

    @Override
    public void addition(int a, int b) {
//        super.addition(a, b);
        c = a + b + 10;
        System.out.println(c);
    }

    public static void main(String args[]) {
        int a = 10, b = 20;
        MainActivity base = new MainActivity();
        base.addition(a, b);
        base.subtraction(a, b);
        base.multiplication(a, b);
        base.sample();
    }
}