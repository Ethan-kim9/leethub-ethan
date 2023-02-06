class Solution {
  public int longestPalindrome(String s) {
        HashMap<Character,Integer> chars = new HashMap<>();
        boolean checkOdd=false;
        int answer = 0;
        for(char c : s.toCharArray()) {
            chars.put(c, chars.getOrDefault(c, 0)+1);
        }

        for(char c : chars.keySet()) {
            int curCnt = chars.get(c); 
            if(curCnt%2 ==0) {
                answer += curCnt; 
            } else {
                answer += curCnt-1;
                if(!checkOdd) checkOdd = true;
            }
        }

        if(checkOdd) answer+=1;
        return answer;
    }
}