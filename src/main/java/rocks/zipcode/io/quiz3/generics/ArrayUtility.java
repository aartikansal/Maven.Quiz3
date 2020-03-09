package rocks.zipcode.io.quiz3.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        HashMap<SomeType, Integer> occurrence = new HashMap<>();
        for (SomeType currentKey : this.array) {
            if (occurrence.containsKey(currentKey)) {
                int currentValue = occurrence.get(currentKey);
                occurrence.replace(currentKey, currentValue + 1);
            } else {
                occurrence.put(currentKey, 1);
            }
        }
        Iterator<Map.Entry<SomeType, Integer>> iter = occurrence.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<SomeType, Integer>
                    currentEntry = iter.next();
            if (currentEntry.getValue() % 2 != 0) {
                return currentEntry.getKey();
            }
        }
        return null;
    }
        public SomeType findEvenOccurringValue () {
            HashMap<SomeType, Integer> occurrence = new HashMap<>();
            for (SomeType currentKey : this.array) {
                if (occurrence.containsKey(currentKey)) {
                    int currentValue = occurrence.get(currentKey);
                    occurrence.replace(currentKey, currentValue + 1);
                } else {
                    occurrence.put(currentKey, 1);
                }
            }
            Iterator<Map.Entry<SomeType, Integer>> iter = occurrence.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<SomeType, Integer>
                        currentEntry = iter.next();
                if (currentEntry.getValue() % 2 == 0) {

                    return currentEntry.getKey();
                }
            }
            return null;


        }
        public Integer getNumberOfOccurrences (SomeType valueToEvaluate){
            int count =0;
            for(SomeType currentItem : array)
            {
                if(currentItem == valueToEvaluate )
                    count++;
            }

            return count;
        }

        public SomeType[] filter (Function < SomeType, Boolean > predicate){
            return null;
        }
    }

