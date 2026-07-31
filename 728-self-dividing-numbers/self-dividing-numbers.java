class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i=left;i<=right;i++)
        {
           boolean flag=true;
           int num=i;
           while(num!=0)
           {
              int mod=num % 10;
              if(mod!=0 && i%mod==0)
              {
                num/=10;
              }
              else
              {
                flag=false;
                break;
              }
           }
           if(flag)
           {
            li.add(i);
           }
        }
        return li;
    }
}