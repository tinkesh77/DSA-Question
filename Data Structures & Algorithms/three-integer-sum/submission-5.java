class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //3sum
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){

            int left = i + 1;
            int right = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
    

            while(left < right){
               int sum = nums[i] + nums[left] + nums[right];
               if(sum == 0) {
                  list.add(new ArrayList(List.of(nums[i] , nums[left] , nums[right])));
                  // found duplicates
                  int leftVal  = nums[left];
                  int rightVal = nums[right];
                  while(left < right && leftVal == nums[left]) left++;
                  while(left < right && rightVal == nums[right]) right --;
               } 
               else if(sum > 0) right--;
               else left++;
            }
        }

        return list;
    }
}
