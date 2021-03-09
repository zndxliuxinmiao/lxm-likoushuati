class Solution {
    public void moveZeroes(int[] nums) {
        // 引入一个新的变量j来记录非0元素要存放的位置
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[j] = nums[i];
                if (j != i){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
