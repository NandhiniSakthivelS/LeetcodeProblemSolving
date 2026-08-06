class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character , Integer> map = new HashMap<>();
        for(Character ch : magazine.toCharArray())
        {
            map.merge(ch,1,Integer::sum);
        }
        for(Character ch : ransomNote.toCharArray())
        {
            if(!map.containsKey(ch))return false;
            else 
            {
                if(map.get(ch)==0) return false;
                else map.compute(ch,(k,v)-> v-1);
            }
        }
        return true;
    }
}