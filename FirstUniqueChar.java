class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();

        for(char b :s.toCharArray()){
            freq.put(b,freq.getOrDefault(b,0)+1);
    
        }

        for(int i = 0;i < s.length();i++){
            if(freq.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;


        
    }
}
