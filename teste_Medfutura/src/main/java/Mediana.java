import java.util.Arrays;

public class Mediana {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 3, 6, 7, 8};


        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n + m];


        for (int i = 0; i < n; i++) {
            merged[i] = nums1[i];
        }


        for (int i = 0; i < m; i++) {
            merged[n + i] = nums2[i];
        }


        Arrays.sort(merged);


        int median;
        int mid = merged.length / 2;
        if (merged.length % 2 == 0) {

            median = (merged[mid - 1] + merged[mid]) / 2;
        } else {

            median = merged[mid];
        }


        System.out.println("A mediana é: " + median);
    }
}
