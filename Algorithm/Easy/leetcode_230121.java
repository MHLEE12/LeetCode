class leetcode_230121 {

    // 704. Binary Search
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}