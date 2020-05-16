package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        if (str.length() > 0) {
            String lowerCase = str.toLowerCase();
            ArrayList<String> result = new ArrayList<>();
            for (int i = 0; i < lowerCase.length(); i++) {
                if (lowerCase.charAt(i) >= 'a' && lowerCase.charAt(i) <= 'z')
                    result.add(StringUtils.capitalizeNthCharacter(lowerCase, i));
            }
            return result.toArray(new String[1]);
        }
        return new String[0];

    }
}
