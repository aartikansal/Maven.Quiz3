package rocks.zipcode.io.quiz3.fundamentals;
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
        StringBuilder stringArr = new StringBuilder();
        return null;
    }


    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
