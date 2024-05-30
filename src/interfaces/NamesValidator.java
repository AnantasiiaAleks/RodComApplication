package interfaces;

public interface NamesValidator {
    public static boolean isValid(String name){
        if (name.length() > 1){
            for (int i = 0; i < name.length(); i++) {
                if (Character.UnicodeBlock.of(name.charAt(i))
                        .equals(Character.UnicodeBlock.CYRILLIC) ||
                        name.charAt(i) == '-') {
                    return true;
                }
            }
        }
        return false;
    }
}
