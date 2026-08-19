package ArrayHardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals17 {
    public static List<List<Integer>> merge(int[][] nums){
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int start=nums[i][0];
            int end=nums[i][1];
            int j=i+1;
            while(j<n && nums[j][0]<=end){
                end=Math.max(end,nums[j][1]);
                j++;
            }
            ans.add(Arrays.asList(start,end));
            i=j-1;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[][] nums={{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> a=merge(nums);
        for(List<Integer> a1:a){
            System.out.print(a1+" ");

        }
    }
}
