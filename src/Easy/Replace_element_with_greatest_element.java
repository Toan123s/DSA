package Easy;

public class Replace_element_with_greatest_element {

    public static void main(String[] args) {

    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max){
                max = temp;
            }
        }
        return arr;
    }
}
