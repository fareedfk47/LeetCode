class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> contains = new HashSet<>();
        
        for(int i=0; i<nums.length;i++){
            if (!contains.add(nums[i])) {
               return true;
            }
        }
        return false;
    }
}