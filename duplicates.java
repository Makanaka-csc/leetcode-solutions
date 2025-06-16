class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        
        HashSet<Integer> seen = new HashSet<Integer>();
        List<Integer> duplicates = new LinkedList<Integer>();

        for(int num : nums){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }

        return duplicates;

        } 

      
    }
