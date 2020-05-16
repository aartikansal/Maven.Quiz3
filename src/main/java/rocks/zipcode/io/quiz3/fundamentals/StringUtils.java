package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        StringBuilder newString = new StringBuilder();
        newString.append(str.subSequence(0, indexToCapitalize));
        newString.append(Character.toUpperCase(str.charAt(indexToCapitalize)));
        newString.append(str.substring(indexToCapitalize + 1));

        return newString.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                set.add(string.substring(i, j));
            }
        }
        return new ArrayList<>(set).toArray(new String[0]);
    }


    public static Integer getNumberOfSubStrings(String input) {
        return getAllSubStrings(input).length;
    }
}
