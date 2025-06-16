class Solution {
    public int arrangeCoins(int n) {

       int rows =0 ;
       while(n >= rows + 1){//if you already have rows, the next rows must be + 1
        rows++; //if so then increment
        n -= rows;

       }

       return rows;
}

}
