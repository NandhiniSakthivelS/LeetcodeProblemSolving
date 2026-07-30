class Solution {
    public List<String> stringMatching(String[] words) {
        
        // hint - If one string is an exact prefix of another, the shorter string comes first, when you sort a string array
        // hint - Arrays.sort(words, Comparator.comparingInt(String::length));

        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(words,Comparator.comparingInt(String::length));
        System.out.print(Arrays.toString(words));

        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[j].contains(words[i])) 
                {
                    list.add(words[i]);
                    break;
                }
                
            }
        }
        return list;
    }
}