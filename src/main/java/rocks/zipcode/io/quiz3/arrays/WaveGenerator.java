package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {


        str = str.toLowerCase();
        ArrayList<String> waver = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder builder=new StringBuilder();
            if(Character.isLetter(str.charAt(i))) {
                builder.append(str,0,i);
                builder.append(str,i+1,str.length());
                waver.add(builder.toString());

            }
        }
        return waver.toArray(new String[0]);
        }


    }