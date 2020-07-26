public class FindMedianSortedArrays {

    public double solution(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (m + n + 1) / 2;
        int right = (m + n + 2) / 2;

        return (find(nums1, 0, nums2, 0, left) + find(nums1, 0, nums2, 0, right)) / 2.0;
    }

    public int find(int[] nums1, int i, int[] nums2, int j, int k) {
        if (i >= nums1.length){
            return nums2[j + k - 1];
        }
        if (j >= nums2.length) return nums1[i + k - 1];
        if (k == 1) {
            return Math.min(nums1[i], nums2[j]);
        }
        int mid1 = (i + k / 2 - 1 < nums1.length) ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
        int mid2 = (j + k / 2 - 1 < nums2.length) ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;

        if (mid1 < mid2) {
            return find(nums1, i + k / 2, nums2, j, k - k / 2);
        } else {
            return find(nums1, i, nums2, j + k / 2, k - k / 2);
        }

    }

    public static void main(String[] args) {
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 3};

        double n = findMedianSortedArrays.solution(nums1, nums2);
        System.out.println(n);

    }
}
