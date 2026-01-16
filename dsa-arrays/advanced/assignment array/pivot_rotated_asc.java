public class pivot_rotated_asc {
    public static void main(String[] args) {
        int[] array = {9, 12, 45, 89, 98, 2, 4, 5, 7};
        int target = 2;
        int result = findtarget(array, target);
        System.out.println(result);
    }

    public static int findtarget(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            }
            // LEFT half sorted
            if (array[start] <= array[mid]) {
                if (array[start] <= target && target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // RIGHT half sorted
            else {
                if (array[mid] < target && target <= array[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
