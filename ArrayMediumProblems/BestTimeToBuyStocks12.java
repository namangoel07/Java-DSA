package ArrayMediumProblems;

public class BestTimeToBuyStocks12 {
    public static int buysell(int[] nums){
        int min=nums[0];
        int profit=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int cost=nums[i]-min;
            profit=Math.max(cost,profit);
            min=Math.min(min,nums[i]);

        }
        return profit;
    }
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        System.out.println(buysell(nums));
    }
}
