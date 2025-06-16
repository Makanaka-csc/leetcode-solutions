class Solution {
    public String reverseWords(String s) {

        String trim = s.trim();

        String[] words = trim.split("\\s+"); //use regex to split for more than one space
        StringBuilder result = new StringBuilder();
        
        for(int i = words.length-1; i >= 0 ; i--){ //decrement
            result.append(words[i]);
            if(i>0){
            result.append(" ");   
        }
        }

        return result.toString();
       


    }
}
