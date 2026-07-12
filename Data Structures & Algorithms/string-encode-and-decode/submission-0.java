class Solution {

    public String encode(List<String> strs) {
        StringBuilder en = new StringBuilder();
        for(String str : strs){
            for(int  i = 0; i<str.length(); i++){
                int val = str.charAt(i);
                en.append(val);
                en.append("-");
            }
            en.append("#");
        }
        return en.toString();
    }

    public List<String> decode(String str) {
            List<String> ans = new ArrayList<>();
    StringBuilder num = new StringBuilder();
    StringBuilder word = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == '-') {
            int ascii = Integer.parseInt(num.toString());
            word.append((char) ascii);
            num.setLength(0); // clear number
        } 
        else if (ch == '#') {
            ans.add(word.toString());
            word.setLength(0); // clear current word
        } 
        else {
            num.append(ch);
        }
    }

    return ans;
    }
}
