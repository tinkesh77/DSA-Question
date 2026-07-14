class Solution {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == ' ') {
                left++;
                continue;
            }
            if (s.charAt(right) == ' ') {
                right--;
                continue;
            }
            char leftLower = Character.toLowerCase(s.charAt(left));
            char rightLower = Character.toLowerCase(s.charAt(right));
            if (!((leftLower >= 'A' && leftLower <= 'Z') || (leftLower >= 'a' && leftLower <= 'z')
                    || (leftLower >= '0' && leftLower <= '9'))) {
                left++;
                continue;
            }

            if (!((rightLower >= 'A' && rightLower <= 'Z')
                    || (rightLower >= 'a' && rightLower <= 'z')
                    || (rightLower >= '0' && rightLower <= '9'))) {
                right--;
                continue;
            }

            if (leftLower != rightLower)
                return false;

            left++;
            right--;
        }
        return true;
    }
}
