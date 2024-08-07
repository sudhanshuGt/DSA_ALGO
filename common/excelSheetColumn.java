import javax.xml.stream.events.Characters;

public class excelSheetColumn {

    public static int getSheetNum(String nString){
        if(nString.length() == 1) return (int) nString.charAt(0) - (int) 'A' + 1;
        int num = (nString.length() - 2 * 26) + (int) nString.charAt(nString.length()-1) - (int) 'A' + 1;
        return num;
    }

    public static void main(String[] args) {
        
        String s = "AB";
        String s1 = "H";
        String s2 = "ABC";

        System.out.println(getSheetNum(s));
        System.out.println(getSheetNum(s1));
        System.out.println(getSheetNum(s2));
        
    }
}
