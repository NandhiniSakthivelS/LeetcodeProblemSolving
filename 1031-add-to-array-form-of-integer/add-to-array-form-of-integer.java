import java.math.*;
import java.util.*; 
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        /*String s = "";
        for(int x : num) {
           s += Integer.toString(x);
        }
        
        BigInteger bi = new BigInteger(s);
        
        BigInteger bo = BigInteger.valueOf(k); 
        BigInteger whole = bi.add(bo);
        while (!whole.equals(BigInteger.ZERO)) {
            
            int mod = whole.remainder(BigInteger.TEN).intValue();
            list.add(mod);
            
            
            whole = whole.divide(BigInteger.TEN);
        }
        Collections.reverse(list);
        
        System.out.println(list);
        return list;*/

        int i=num.length-1;
        while(i>=0 || k>0)
        {
            if(i>=0)
            {
                k=num[i]+k;
            }
            list.add(k%10);
            k/=10;
            i--;
        }
        Collections.reverse(list);
        
        System.out.println(list);
        return list;
    }
}