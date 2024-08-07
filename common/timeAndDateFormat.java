
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class timeAndDateFormat {
    public static void main(String[] args) {
        System.out.println(convertToUtc());
    }

  
    
    public static String convertToUtc() {
        Date localDateTime = new Date();
        TimeZone localTimeZone = TimeZone.getDefault();
        DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
        outputFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utcDateTime = outputFormat.format(localDateTime);
    
        return utcDateTime;
    }
    
}


