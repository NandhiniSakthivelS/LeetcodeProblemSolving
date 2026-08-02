class Solution {
    public int countWords(String[] words1, String[] words2) {
        ArrayList<String> list=new ArrayList<>();
        //Arrays.sort(words1);
        //Arrays.sort(words2);
        
        for(int i=0;i<words1.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<words1.length;j++)
            {
                if(i==j)continue;
                if(words1[i].equals(words1[j]))
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)list.add(words1[i]);
        }
        System.out.println(list);
        
        
         
         for(int i=0;i<words2.length;i++)
        {
            boolean flag = false;
            
            for(int j=0;j<words2.length;j++)
            {
                if(i==j)continue;
                if(words2[i].equals(words2[j]))
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)list.add(words2[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        int count=0;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i).equals(list.get(i+1)))count++;
        }
        return count;


        /*for(int i=0;i<words1.length-1;i++)
        {
            if(words1[i].isEmpty())continue;
            if(!words1[i].equals(words1[i+1])) list1.add(words1[i]);
            else words1[i+1]="";
        }
        if(!words1[words1.length-1].isEmpty()) list1.add(words1[words1.length-1]);
        System.out.println(list1);
        for(int i=0;i<words2.length-1;i++)
        {
            if(words2[i].isEmpty())continue;
            if(!words2[i].equals(words2[i+1])) list1.add(words2[i]);
            else words2[i+1]="";
        }
        if(!words2[words2.length-1].isEmpty()) list1.add(words2[words2.length-1]);
        System.out.println(list1);
        Collections.sort(list1);
        int count=0;
        for(int i=0;i<list1.size()-1;i++)
        {
            if(list1.get(i).equals(list1.get(i+1)))count++;
        }
        return count;*/
        
        /*Arrays.sort(words1);
        Arrays.sort(words2);
        for(int i=0;i<words1.length-1;i++)
        {
            if(words1[i].equals(""))continue;
            if(words1[i].equals(words1[i+1]) )
            {
               words1[i]="";
               words1[i+1]="";
            }
        }
        for(int i=0;i<words2.length-1;i++)
        {
            if(words2[i].equals(""))continue;
            if(words2[i].equals(words2[i+1]) )
            {
               words2[i]="";
               words2[i+1]="";
            }
        }

        System.out.println((Arrays.toString(words1)));
        System.out.println((Arrays.toString(words2)));
        int count=0;
        for(int i=0;i<words1.length;i++)
        {
            if(words1[i].equals("")) continue;
            for(int j=0;j<words2.length;j++)
            {
                if(words1[i].equals("")) continue;
                if(words1[i].equals(words2[j]))count++;
            }
        }
        return count;*/
    }
}