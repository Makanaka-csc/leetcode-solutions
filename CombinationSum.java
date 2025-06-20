class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backTrack(candidates,0, target, new ArrayList<>(), result);

        return result;
        
    }

    private void backTrack(int candidates[],int start,int target,List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
             }

        else if(target < 0){
            return;
        }

        for(int i = start; i < candidates.length; i++){
            int num = candidates[i];

            current.add(num);
            backTrack(candidates,i, target-num,current,result);//continue backtracking

            current.remove(current.size()-1);//if it didnt work remove the last value and use a different one
        }
    }
}
