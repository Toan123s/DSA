package Medium;

public class reverse_integer {
    public static void main(String[] args) {
        int reverse_integer = reverse(89834);
        System.out.println(reverse_integer);
    }
    public static int reverse(int x) {
        int dau = 1, n = x;
        int reverse_number = 0;
        if(x < 0){
            n = -x;
            dau = -1;
        }
        while(n !=0 ){
            int donvi = n % 10;
            if (reverse_number > Integer.MAX_VALUE / 10 || (reverse_number == Integer.MAX_VALUE / 10 && donvi > 7)) {
                return 0;
            }
            if (reverse_number < Integer.MIN_VALUE / 10 || (reverse_number == Integer.MIN_VALUE / 10 && donvi < 8)) {
                return 0;
            }
            reverse_number = reverse_number*10 + donvi;
            n /= 10;

        }
        return dau * reverse_number;
    }
}
