package Medium;

public class Container_with_most_water {
    public static void main(String[] args) {
        int height[] = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int l = 0, r = height.length - 1, V = 0;
        while (l < r) {
            V = (r - l) * Math.min(height[l], height[r]);
            if (height[l] > height[r]) {
                if (height[r] * (r - l) > V) {
                    V = height[r] * (r - l);
                }
                r--;
            } else {
                if (height[l] * (r - l) > V) {
                    V = height[l] * (r - l);
                }
                l++;
            }

        }
        return V;
    }
}

