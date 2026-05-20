class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int firstIndex=-1,secondIndex=-1;
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(m.containsKey(complement)){
                firstIndex = m.get(complement);
                secondIndex = i;
                break;
            }
           m.put(nums[i],i);
        }
        return new int[] {firstIndex,secondIndex};
    }
}
