class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String , List<String>> map  = new HashMap<>();
        for(String str : strs){

            // count the feq
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }

            // create an key

            StringBuilder key = new StringBuilder();

            for(int i = 0; i<26; i++){
                key.append("&");
                key.append(count[i]);
            }

            if(!map.containsKey(key.toString())){
                map.put(key.toString() , new ArrayList<>());
            }

            map.get(key.toString()).add(str);
        }

        ans.addAll(map.values());
        return ans;
    }
}
