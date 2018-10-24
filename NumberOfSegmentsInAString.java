public class NumberOfSegmentsInAString {

    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
        System.out.println(countSegments("      foo bar"));
        System.out.println(countSegments(" "));
    }

    public static int countSegments(String s) {
        s = s.replaceAll("( )+", " ");
        s = s.trim();
        if(s.equals(""))
            return 0;
        return s.split(" ").length;
    }

}
