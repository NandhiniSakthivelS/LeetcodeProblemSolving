class Solution {
    public String clearDigits(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for(int i=0;i<s.length();i++)
        {
            Character ch = s.charAt(i);
            if(Character.isDigit(ch)) stack.pop();
            else stack.push(ch);
        }
        System.out.println(stack);
        String output ="";
        for(Character ch : stack)
        {
            output = ch+output;
        }
        return output;
    }
}