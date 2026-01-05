package Easy;

public class palindrome_number {
    public static void main(String[] args) {
        boolean check = isPalindrome(-121);
        System.out.println(check);
    }

    public static boolean isPalindrome(int x) {
        int dau = 1;
        if(x < 0){
            dau = -1;
        }
        int n = dau * x;
        int reverse_number = 0;
        while(n != 0){
            reverse_number = reverse_number * 10 + n % 10;
            n /= 10;
        }
        return reverse_number == x;
    }
}
