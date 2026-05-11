//     *************Separate the digits in an array Leetcode 2553*************************


    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            ArrayList<Integer> lis=new ArrayList<>();
            while(n>0){
                int last=n%10;
                lis.add(last);
                n=n/10;
            }
            for(int j=lis.size()-1;j>=0;j--){
                list.add(lis.get(j));
            }
        }
        int ans[]=new  int[list.size()]; 
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    

