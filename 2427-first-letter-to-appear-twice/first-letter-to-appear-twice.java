class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray())
        {
            if(map.containsKey(ch)) return ch;
            else 
            {
                map.merge(ch,1,Integer::sum);
            }
        }
        return 'a';
    }
}