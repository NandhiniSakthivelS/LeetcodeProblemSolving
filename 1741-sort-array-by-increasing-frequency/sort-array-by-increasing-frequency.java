import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.merge(x, 1, Integer::sum);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        
        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys, Collections.reverseOrder());
        
        int pos = 0;
        
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            
            for (int key : sortedKeys) {
                if (map.containsKey(key) && map.get(key) == num) {
                    for (int j = 0; j < num; j++) {
                        nums[pos++] = key;
                    }
                    map.remove(key); 
                    break;
                }
            }
        }
        return nums;
    }
}
