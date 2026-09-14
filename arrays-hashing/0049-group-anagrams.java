import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] count = new char[26];
            for (char a : s.toCharArray()) {
                count[a - 'a']++;
            }
            String key = new String(count);
            List<String> current = map.get(key);
            if (current == null) {
                current = new ArrayList<>();
                map.put(key, current);
            }
            current.add(s);
        }
        return new ArrayList<>(map.values());
    }
}
