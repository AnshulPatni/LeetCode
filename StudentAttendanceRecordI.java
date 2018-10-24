public class StudentAttendanceRecordI {

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));      // true
        System.out.println(checkRecord("PPALLL"));      // false
    }

    public static boolean checkRecord(String s) {
        int countA = 0, countL = 0;
        for(char c: s.toCharArray()) {
            if(c == 'A') {
                countL = 0;
                countA++;
                if(countA > 1)
                    return false;
            } else if( c == 'L') {
                countL++;
                if(countL > 2)
                    return false;
            } else
                countL = 0;
        }
        return true;
    }

}
