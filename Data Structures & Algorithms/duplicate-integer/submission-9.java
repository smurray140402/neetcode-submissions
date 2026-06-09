class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        int[] numsSorted = nums.clone();
        Arrays.sort(numsSorted);

        for (int i = 0; i < n-1; i++) {
            if (numsSorted[i] == numsSorted[i+1]) {
                return true;
            }
        }

        return false;
    }
}