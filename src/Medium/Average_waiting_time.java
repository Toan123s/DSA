package Medium;

public class Average_waiting_time {

    public static void main(String[] args) {

    }

    public double averageWaitingTime(int[][] customers) {
        int arrives = customers[0][0];
        long tong = 0;
        for(int[] customer : customers){
            if(customer[0] > arrives){
                arrives += customer[0] - arrives;
            }
            arrives += customer[1];
            tong += arrives - customer[0];
        }
        return 1.0 * tong / customers.length;
    }
}
