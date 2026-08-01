class Solution {
    public int hammingDistance(int x, int y) {
        String binaryStr1 = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String binaryStr2 = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
        System.out.println(binaryStr1+" "+binaryStr2);
        int count=0;
        for(int i=0;i<binaryStr1.length();i++)
        {
           char ch=binaryStr1.charAt(i);
           char ch2=binaryStr2.charAt(i);
           if(ch!=ch2)count++;
        }
        return count;
    }
}