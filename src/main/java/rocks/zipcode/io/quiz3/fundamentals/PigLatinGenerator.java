package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        StringBuilder newString = new StringBuilder();
        String vowels = "aeiou";
        if (vowels.indexOf(Character.toLowerCase(str.charAt(0))) != -1) {
            newString.append(str + "way");
            return newString.toString();
        } else if (checkForVowels(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (vowels.indexOf(Character.toLowerCase(str.charAt(i))) != -1) {
                    newString.append(str.substring(i) + str.substring(0, i) + "ay");
                    return newString.toString();
                }
            }
            return newString.toString();
        }
        return newString.append(str + "ay").toString();
    }

        public Boolean checkForVowels(String str){
            String vowels = "aeiou";
            for (int i = 0; i<str.length(); i++){
                if (vowels.indexOf(Character.toLowerCase(str.charAt(i))) != -1) {
                    return true;
                }
            }return false;
        }
    }



