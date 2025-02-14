package sorting;

import java.util.Arrays;

public class SortEmployeeIds {
    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 109, 101, 107};
        for(int i=0;i< employeeIDs.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(employeeIDs[j]<employeeIDs[j-1]) swap(employeeIDs,j,j-1);
                else break;
            }
        }
        System.out.println(Arrays.toString(employeeIDs));
    }
    static void swap(int[]arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
