class Solution {
    public void moveZeroes(int[] nums) {
        // Write your code here.
        int j=-1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               j=i;
               break;
           }
        }
        
        if(j==-1) return;

        for(int i=j+1;i<nums.length;i++){
           if(nums[i]!=0){
              int tmp=nums[i];
              nums[i]=nums[j];
              nums[j]=tmp;
              j++;
           }
        }
    }
}