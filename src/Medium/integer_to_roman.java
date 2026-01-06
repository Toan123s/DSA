package Medium;
import java.util.HashMap;

public class integer_to_roman {
    public static void main(String[] args) {

    }

    public static String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        StringBuilder res = new StringBuilder();

        int soHang = 1;
        int tmp = num;
        while (tmp >= 10) {
            soHang *= 10;
            tmp /= 10;
        }

        while (soHang > 0) {
            int soDau = num / soHang;

            if (soDau == 4) {
                res.append(map.get(soHang));
                res.append(map.get(5 * soHang));
            } else if (soDau == 9) {
                res.append(map.get(soHang));
                res.append(map.get(10 * soHang));
            } else if (soDau >= 5) {
                res.append(map.get(5 * soHang));
                for (int i = 0; i < soDau - 5; i++) {
                    res.append(map.get(soHang));
                }
            } else {
                for (int i = 0; i < soDau; i++) {
                    res.append(map.get(soHang));
                }
            }

            num %= soHang;
            soHang /= 10;
        }

        return res.toString();
    }
}
