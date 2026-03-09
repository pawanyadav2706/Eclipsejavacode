public class Majorityelement {
    public static void main(String[] args){
        int nums[] = {2,2,1,1,1,1};
        int result  = majority(nums);
        System.out.println("Majority element = " + result);
    }


    public static int  majority(int[]nums){
        int n = nums.length;

        for(int  i =0; i<n; i++){
            int count = 0;

            for(int j =0; j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;

    }
}
