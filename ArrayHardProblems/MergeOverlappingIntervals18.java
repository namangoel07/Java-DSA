package ArrayHardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals18 {
    public static List<List<Integer>> merge(int[][] nums){
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        List<List<Integer>> list=new ArrayList<>();
        for(int[] intervals:nums){
            if(list.size()==0|| list.get(list.size()-1).get(1)<intervals[0]){
                list.add(Arrays.asList(intervals[0],intervals[1]));

            }
            else{
                int last=list.size()-1;
                int maxelem=Math.max(list.get(last).get(1),intervals[1]);
                list.get(last).set(1, maxelem);
            }
        }
        return list;
    }
    public static void main(String[] args) {
          int[][] nums={{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> a=merge(nums);
        for(List<Integer> a1:a)
        {
            System.out.print(a1+" ");
        }
    }
}
