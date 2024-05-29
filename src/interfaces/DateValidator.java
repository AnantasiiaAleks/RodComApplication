package interfaces;

import java.text.SimpleDateFormat;

public interface DateValidator {
    static boolean isValid(String dateStr) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        myFormat.setLenient(false);
        try {
            myFormat.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
