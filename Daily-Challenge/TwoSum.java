 public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int sum=0;
        int idx1=0;
        int idx2=0;
     for(int i=0;i<nums.length;i++ ){
         int curr=nums[i];
         for(int j=i+1;j<nums.length;j++){
             sum=curr+nums[j];
            if(sum==target){
                idx1=i;
                idx2=j;
            }
            }
         } 
         return new int[]{idx1,idx2} ;
    }
    public static void main(String args[]){
        int nums[]=new int[5];
        for(int i=0;i<5;i++){
            nums[i]=i*i;
        }
        int target=16;
        int arr[]=twoSum(nums,target);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }  
    }
}
