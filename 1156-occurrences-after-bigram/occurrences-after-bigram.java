class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list = new ArrayList<>();
        String ans []= text.split(" ");
        for(int i=0;i<ans.length-2;i++)
        {
            if(ans[i].equals(first) && ans[i+1].equals(second))
            {
                list.add(ans[i+2]);
            }
        }
        String fin[]=new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            fin[i]=list.get(i);
        }
        return fin;
    }
}