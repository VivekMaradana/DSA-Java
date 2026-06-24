public class StudentAttendanceRecordI {
    // Leet code problem number:551
    public boolean checkRecord(String s) {
        int a=0;
        for(char b:s.toCharArray()){
            if(b=='A') a++;
            if(a>=2) return false;
        }
        if(s.contains("LLL")){
            return false;
        }
        return true;
    }
}
