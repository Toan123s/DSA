package Medium;

public class Zigzag_conversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        String zigzag_s = convert(s, 4);
        System.out.println(zigzag_s);
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder rows[] = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int cur = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rows[cur].append(c);
            if (cur == 0 || cur == numRows - 1) goingDown = !goingDown;
            cur += goingDown ? 1 : -1;
        }

        StringBuilder zigzag_s = new StringBuilder();
        for (StringBuilder row : rows) {
            zigzag_s.append(row);
        }

        return zigzag_s.toString();
    }
}
