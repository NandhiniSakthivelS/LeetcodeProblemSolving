class Solution {
    public String reverseStr(String s, int k) {
        //String ans ="";
        int add=1;
         StringBuilder sb1 = new StringBuilder();
         StringBuilder sb2=new StringBuilder();
         StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           
            if(add<=k)
            {
                sb1.append(s.charAt(i));
                System.out.print(sb1+" ");
                add++;
            }
            else if(add<=(k*2))
            {
               sb2.append(s.charAt(i));
               System.out.print(sb2+" ");
               add++;
            }
            if(add>(k*2))
            {
                ans.append(sb1.reverse());
                ans.append(sb2);
                add=1;
                sb1.setLength(0);
                sb2.setLength(0);
            }
        }
        ans.append(sb1.reverse());
        ans.append(sb2);
        return ans.toString();
    }
    
}