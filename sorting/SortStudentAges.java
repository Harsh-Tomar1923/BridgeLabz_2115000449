package sorting;
import java.util.Arrays;

public class SortStudentAges {
    public static void main(String[] args) {
        int[]studentAges={17,15,18,11,15,13,14,10,11};
        int[]arr=new int[max(studentAges)+1];
        System.out.println(Arrays.toString(countSort(arr,studentAges)));
    }
    public static int[] countSort(int[]arr,int[] nums){
        int[]ans=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++) arr[nums[i]]++;
        for(int i=0;i<arr.length;i++){
            while(k<ans.length && arr[i]!=0){
                ans[k++]=i;
                arr[i]--;
            }
        }
        return ans;
    }
    public static int max(int[]arr){
        int maxi=Integer.MIN_VALUE;
        for(int i:arr){
            if(maxi<i)maxi=i;
        }return maxi;
    }
}
