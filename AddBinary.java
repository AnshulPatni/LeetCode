public class AddBinary {

    public static void main(String[] args) {
//        System.out.println("111".substring(1,2));
        System.out.println(addBinary("11","1"));        // 100
        System.out.println(addBinary("1010","1011"));   // 10101
        System.out.println(addBinary("100","110010"));  // 110110
//        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
//                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));   // 10101
    }

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0) {
                sum += a.charAt(i)-'0';
            }

            if(j >= 0) {
                sum += b.charAt(j)-'0';
            }

            if(sum == 3) {
                sb.append("1");
                carry = 1;
            } else if(sum == 2) {
                sb.append("0");
                carry = 1;
            } else if(sum == 1) {
                sb.append("1");
                carry = 0;
            } else {
                sb.append("0");
                carry = 0;
            }

            i--;
            j--;
        }

        if(carry == 1) {
            sb.append("1");
        }

        return sb.reverse().toString();

        /*String res = "";
        int len = Math.max(a.length(), b.length());
        StringBuilder sb1 = new StringBuilder(a);
        StringBuilder sb2 = new StringBuilder(b);
        sb1.reverse();
        sb2.reverse();
        String a_new = sb1.toString();
        String b_new = sb2.toString();
        int carryOver = 0, tempSum = 0;
        for(int i = 0; i < len; i++) {
            if(a_new.length()-1 >= i && b_new.length()-1 >= i) {
                tempSum = Integer.parseInt(a_new.substring(i,i+1)) + Integer.parseInt(b_new.substring(i,i+1));
                tempSum = tempSum + carryOver;
            } else if (b_new.length()-1 < i) {
                tempSum = Integer.parseInt(a_new.substring(i,i+1)) + carryOver;
            } else if (a_new.length()-1 < i) {
                tempSum = Integer.parseInt(b_new.substring(i,i+1)) + carryOver;
            }
            if(tempSum < 2) {
                res = res + tempSum;
                carryOver = 0;
            }
            else if(tempSum == 2) {
                res = res + "0";
                carryOver = 1;
            } else if(tempSum == 3) {
                res = res + "1";
                carryOver = 1;
            }
            System.out.printf("TempSum: %d, CarryOver: %d\n", tempSum, carryOver);
        }
        if(carryOver == 1) {
            res = res + "1";
        }
        return (new StringBuilder(res)).reverse().toString();*/

    }

}
