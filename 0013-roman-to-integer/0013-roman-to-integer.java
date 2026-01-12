import java.util.HashMap;

class Solution {
    HashMap<Character, Integer> roman = new HashMap<>();

    public int romanToInt(String s) {
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int acumulator = 0;

        for (int index = 0; index < s.length(); index++) {
            int current = roman.get(s.charAt(index));
            if (index + 1 < s.length() && current < roman.get(s.charAt(index + 1))) {
                acumulator -= current;
            } else {
                acumulator += current;
            }
        }
        return acumulator;
    }
}