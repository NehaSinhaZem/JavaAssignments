package Interfaces;

class Calculation extends Variables implements Display {
    double res;
    String str = "";

    Calculation(int a, int b, String x, String y) {
        super(a, b, x, y);
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public String addition(String a, String b) {
        return a + b;
    }

    public int division(int a, int b) {
        return (int) a / b;
    }

    public String division(String a, String b) {
        String s = "";
        for (int i = 0; i < a.length(); i++)
            if (!b.contains("" + a.charAt(i)))
                s += a.charAt(i);
        return s;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public String subtraction(String a, String b) {
        String s = "";
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            s += (char) (a.charAt(i) - b.charAt(i) + 65);
        }
        return s;
    }

    public void display() {
        System.out.println(res);
        System.out.println(str);
    }

    void m1(Add add) {
        Calculation cal = (Calculation) add;
        res = addition(cal.a, cal.b);
        str = addition(cal.x, cal.y);
    }

    void m2(Subtract sub) {
        Calculation cal = (Calculation) sub;
        res = subtraction(cal.a, cal.b);
        str = subtraction(cal.x, cal.y);
    }

    void m3(Display dis) {
        dis.display();
    }

    void m4(Divide div) {
        Calculation cal = (Calculation) div;
        res = division(cal.a, cal.b);
        str = division(cal.x, cal.y);
    }
}
