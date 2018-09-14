public class RobotReturnToOrigin {

    public static void main(String[] args) {
        String str1 = "UD";
        String str2 = "LL";
        System.out.println(judgeCircle(str1));
        System.out.println(judgeCircle(str2));
    }

    public static boolean judgeCircle(String moves) {
        int[] ch =  new int[128];

        for(char c : moves.toCharArray())   {
            ch[c]++;
        }

        if(ch['U'] == ch['D'] && ch['L'] == ch['R']) return true;

        return false;
    }
}
