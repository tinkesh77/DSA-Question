class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = 1;
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int i = 0; i<nums.length; i++){
            // start of the seq
            if(!set.contains(nums[i] - 1)){
                int val = nums[i];
                int count = 1;
                while(set.contains(val + 1)){
                    count++;
                    val = val + 1;
                }
                maxCount = Math.max(maxCount , count);
            }
             
        }

        return maxCount;
    }
}
