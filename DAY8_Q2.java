class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[26];
        for (int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            freq[c - 'a'] += 1;
        }
        for (int i=0; i<s2.length(); i++) {
            char c = s2.charAt(i);
            freq[c - 'a'] -= 1;
        }
        for (int f : freq) {
            if (f != 0) return false;
        }
        return true;
    }
}
