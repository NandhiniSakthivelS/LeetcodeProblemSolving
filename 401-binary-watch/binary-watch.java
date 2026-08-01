class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> list = new ArrayList<>();
        if(turnedOn>8) return list;

        for(int h=0;h<12;h++)
        {
            for(int m=0;m<60;m++)
            {
                int n1=Integer.bitCount(h);
                int n2=Integer.bitCount(m);
                if(n1+n2 ==turnedOn)
                {
                    String timeStr = String.format("%d:%02d", h, m);
                    list.add(timeStr);
                }
            }
        }

        //String timeStr = String.format("%d:%02d", h, m);
        return list;
    }
}