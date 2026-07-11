class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();

        List<Integer> feq[] = new List[nums.length + 1];

        for(int i = 0; i<feq.length; i++){
            feq[i] = new ArrayList<>();
        }

        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            feq[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i  = feq.length-1; i>0 && index < k; i--){
            for(int n : feq[i]){
                ans[index++] = n;
                if(index == k) return ans;
            }
        }
        return ans;
    }
}
