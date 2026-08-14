class Solution {
    public boolean isMatch(String s, String p) {
        Boolean[][] dp = new Boolean[s.length() + 1][p.length() + 1];
        return solve(s, p, 0, 0, dp);
    }

    private boolean solve(String s, String p, int i, int j, Boolean[][] dp) {

        // Pattern completely used
        if (j == p.length()) {
            return i == s.length();
        }

        // Already calculated
        if (dp[i][j] != null) {
            return dp[i][j];
        }

        // Check if current characters match
        boolean firstMatch = (i < s.length()) &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        boolean result;

        // Next character in pattern is '*'
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // Option 1: '*' matches zero characters
            // Option 2: '*' matches current character
            result = solve(s, p, i, j + 2, dp) ||
                     (firstMatch && solve(s, p, i + 1, j, dp));

        } else {

            // Normal character or '.'
            result = firstMatch &&
                     solve(s, p, i + 1, j + 1, dp);
        }

        dp[i][j] = result;
        return result;
    }
}