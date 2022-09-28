public class A2 {
    public A2() {

    }

    public void taskB() {
        int a = 0;
        int b = 4;
        int c = b / a;
        if (a != 0 && b / a < 10) {
            System.out.println("If-Statement truthy");
            System.out.println(c);
        } else {
            System.out.println("If-Statement falsy");
        }
    }

    public void taskA() {
        System.out.println("Running If-Statement");
        if (method1() && method2()) {
            System.out.println("If-Statement truthy");
        } else {
            System.out.println("If-Statement falsy");
        }
    }

    private boolean method1() {
        System.out.println("method1 executed");
        return false;
    }

    private boolean method2() {
        System.out.println("method2 executed");
        return true;
    }
}
