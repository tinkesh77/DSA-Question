class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int preFix = 1;
        int posFix = 1;
        for(int i = 0; i<ans.length; i++){
            ans[i] = preFix;
            preFix = preFix * nums[i];
        }

        for(int i = ans.length-1; i>=0; i--){
            ans[i] = posFix * ans[i];
            posFix = posFix * nums[i];
        }
        return ans;
    }
}  
