package Easy;

public class Can_place_flowers {
    public static void main(String[] args) {

    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0 || flowerbed.length == 1 && flowerbed[0] == 0){
            return true;
        }

        int dem = 0;

        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            dem++;
        }

        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
            flowerbed[flowerbed.length - 1] = 1;
            dem++;
        }
        for(int i = 1; i < flowerbed.length - 1; i++){
            if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                flowerbed[i] = 1;
                dem++;
            }
        }
        return dem >= n;
    }
}
