class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String[] rows = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int row = 0;
        boolean goingDown = true;

        for (int i = 0; i < s.length(); i++) {

            // Put current character in current row
            rows[row] += s.charAt(i);

            // Change direction at the top or bottom
            if (row == numRows - 1) {
                goingDown = false;
            }

            if (row == 0) {
                goingDown = true;
            }

            // Move to the next row
            if (goingDown) {
                row++;
            } else {
                row--;
            }
        }

        StringBuilder result = new StringBuilder();

        for (String r : rows) {
            result.append(r);
        }

        return result.toString();
    }
}