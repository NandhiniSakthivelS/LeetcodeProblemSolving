class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                list.add(ch-'0');
            }
        }
        return list.stream()
                .distinct()                                 
                .sorted(Comparator.reverseOrder())           
                .skip(1)                                     
                .findFirst()
                .orElse(-1);                                

    }
}