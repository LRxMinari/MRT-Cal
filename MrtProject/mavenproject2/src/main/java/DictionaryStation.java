import java.util.*;

public class DictionaryStation {
    public String StationName;
    public int StationNumber;
        Dictionary<String, Integer> MRTStation = new Hashtable<>();
        public DictionaryStation(){
        MRTStation.put("โปรดเลือกสถานี", 0);
        MRTStation.put("คลองบางไผ่ (PP01)", 1);
        MRTStation.put("ตลาดบางใหญ่ (PP02)", 2);
        MRTStation.put("สามแยกบางใหญ่ (PP03)", 3);
        MRTStation.put("บางพลู (PP04)", 4);
        MRTStation.put("บางรักใหญ่ (PP05)", 5);
        MRTStation.put("บางรักน้อยท่าอิฐ (PP06)", 6);
        MRTStation.put("ไทรม้า (PP07)", 7);
        MRTStation.put("สะพานพระนั่งเกล้า (PP08)", 8);
        MRTStation.put("แยกนนทบุรี 1 (PP09)", 9);
        MRTStation.put("บางกระสอ (PP10)", 10);
        MRTStation.put("ศูนย์ราชการนนทบุรี (PP11)", 11);
        MRTStation.put("กระทรวงสาธารณสุข (PP12)", 12);
        MRTStation.put("แยกติวานนท์ (PP13)", 13);
        MRTStation.put("วงศ์สว่าง (PP14)", 14);
        MRTStation.put("บางซ่อน (PP15)", 15);
        MRTStation.put("เตาปูน (PP16)", 16);
    }
}
