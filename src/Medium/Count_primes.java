package Medium;

public class Count_primes {

    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        int dem = 0;
        // Eratosthenes
        // array
        boolean[] arr = new boolean[n];

        for(int i = 2; i < n; i++){
            arr[i] = true;
        }


        for (int i = 2; i * i < n; i++) {
            if (arr[i]) {
                for (int j = i * i; j < n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(arr[i]){
                dem++;
            }
        }

        return dem;
    }
}
