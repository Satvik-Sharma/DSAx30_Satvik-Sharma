class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        s = s.trim();
        if (s.isEmpty()) return 0;

        int ans = 0;
        boolean isNeg = false;
        int i = 0;

        if (s.charAt(i) == '-') {
            isNeg = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') break;

            int digit = c - '0';
            
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return isNeg ? -ans : ans;
    }
}
