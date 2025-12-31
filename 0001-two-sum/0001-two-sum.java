class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer index1, index2;
        Integer TAM = nums.length;
        int twoIndiceValues[] = new int[2];
        for(index1 = 0 ; index1 < TAM ; index1++){
            for(index2 = 0 ; index2 < TAM ; index2++){
                if(nums[index1] + nums[index2] == target && index1 != index2){
                    twoIndiceValues[0] = index1;
                    twoIndiceValues[1] = index2;
                }
            }
        }
        return twoIndiceValues;
    }
}