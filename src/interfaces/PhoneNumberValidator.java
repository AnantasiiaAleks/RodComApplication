package interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface PhoneNumberValidator {
    public static boolean isValid(String phoneNumber){
        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(phoneNumber);
        return (m.matches());
    }
}
