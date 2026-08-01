package ArrayMediumProblems;

public class SortColors4 {
    public static void sortColor(int[] nums)
    {
       int count_zero=0;
       int count_one=0;
       int count_two=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            count_zero++;
        }
        else if(nums[i]==1){
            count_one++;
        }
        else{
            count_two++;
        }
       }
       for(int i=0;i<count_zero;i++){
        nums[i]=0;
       }
       for(int i=count_zero;i<count_zero+count_one;i++){
        nums[i]=1;
       }
       for(int i=count_zero+count_one;i<count_zero+count_one+count_two;i++){
        nums[i]=2;
       }
       for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
       }

    }
    public static void main(String[] args) {
        int[] nums={0,1,2,0,1,2,1,2,0,0,0,1};
        sortColor(nums);
    }
}
