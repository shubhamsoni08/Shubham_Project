package Operator;

public class Addition {

    int a;
    int b;
    int result;

    Addition(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int info()
    {
        return result = a + b;

    }

    public int info1 (int a, int b)
    {
        return result = a * b;
    }

    public static void main(String[] args) {

        Addition r = new Addition(5, 6);
        System.out.println(r.info());
        System.out.println(r.info1(1, 2));

    }




}
