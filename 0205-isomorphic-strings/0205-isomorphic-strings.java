import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> characterMap = new HashMap<>();

        for(int i=0; i< s.length(); i++){
            char frontChar = s.charAt(i);
            char backChar = t.charAt(i);

            if(i==0){
                characterMap.put(frontChar,backChar);
            }
            if (characterMap.containsKey(frontChar)) {
                if(!characterMap.containsValue(backChar)){
                    return false;
                }
                if(characterMap.get(frontChar) != backChar){
                    return false;
                }
            }else{
                if(characterMap.containsValue(backChar)){
                    return false;
                }
                characterMap.put(frontChar,backChar);
            }
                
        }
        return true;
    }
}