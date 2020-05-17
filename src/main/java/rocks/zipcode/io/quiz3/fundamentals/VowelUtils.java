package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        boolean solution = false;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    solution = true;
                    return solution;
                }
            }
        }
        return solution;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return null;
    }

    public static Boolean isVowel(Character character) {
        return null;
    }
}
