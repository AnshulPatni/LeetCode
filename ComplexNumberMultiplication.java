public class ComplexNumberMultiplication {

    public static void main(String[] args) {
        String a = "1+0i";
        String b = "1+0i";
        System.out.println(complexNumberMultiply(a, b));
        String c =  "1+-1i";
        String d = "1+-1i";
        System.out.println(complexNumberMultiply(c, d));
    }

    public static String complexNumberMultiply(String a, String b) {
        String newA[] = a.split("(\\+|i)");
        String newB[] = b.split("(\\+|i)");
        int a1, a2, b1, b2;

        a1 = Integer.parseInt(newA[0]);
        a2 = Integer.parseInt(newA[1]);
        b1 = Integer.parseInt(newB[0]);
        b2 = Integer.parseInt(newB[1]);

        int resA = (a1*b1) - (a2*b2);
        int resB = (a1*b2) + (a2*b1);

        return Integer.toString(resA)+"+"+Integer.toString(resB)+"i";
    }

}
