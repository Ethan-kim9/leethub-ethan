class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        int count = 0;
        if(sCharArray.length==0) return true;
        for (char c : tCharArray) {
            if(sCharArray.length == count){
                return true;
            }
            if(c == sCharArray[count]) count++;
        }
        return sCharArray.length == count;
    }
}