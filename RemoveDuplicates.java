class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        
        for(char c : s.toCharArray()){
        int len = stack.length();
        if(len != 0 && stack.charAt(len-1) == c){//if the letter in the stack is equal to c then delete the prevois letter
            stack.deleteCharAt(len-1);//delete the previous letter
        }
        else{
            stack.append(c);//else just add to the stack
        }

        }
        return stack.toString();
    }

}
