import java.util.ArrayList;

public class BaseballGame {

    public static void main(String[] args) {
        String[] input1 = new String[]{"5","2","C","D","+"};
        String[] input2 = new String[]{"5","-2","4","C","D","9","+","+"};

        System.out.println(calPoints(input1));
        System.out.println(calPoints(input2));
    }

    public static int calPoints(String[] ops) {
        int val = 0, sizeMinusOne = 0;
        ArrayList<Integer> lastRounds = new ArrayList<>();
        for(int i = 0; i < ops.length; i++) {
            sizeMinusOne = lastRounds.size() - 1;
            switch (ops[i]) {
                case "+":
                    val = val + lastRounds.get(sizeMinusOne) + lastRounds.get(sizeMinusOne - 1);
                    lastRounds.add(lastRounds.get(sizeMinusOne) + lastRounds.get(sizeMinusOne - 1));
                    break;
                case "D":
                    val = val + (lastRounds.get(sizeMinusOne) * 2);
                    lastRounds.add((lastRounds.get(sizeMinusOne) * 2));
                    break;
                case "C":
                    val = val - lastRounds.get(sizeMinusOne);
                    lastRounds.remove(sizeMinusOne);
                    break;
                default:
                    val = val + Integer.parseInt(ops[i]);
                    lastRounds.add(Integer.parseInt(ops[i]));
            }
        }
        return val;
    }
}

/*
Given a list of strings, each string can be one of the 4 following types:

1. Integer (one round's score): Directly represents the number of points you get in this round.
2. "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
3. "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
4. "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
*/