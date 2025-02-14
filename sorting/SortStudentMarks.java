package sorting;

import java.util.Arrays;

public class SortStudentMarks {
    public static void main(String[] args) {
        int[] studentMarks = {85, 72, 90, 65, 88, 76};
        for(int i=0;i<studentMarks.length;i++){
            for(int j=1;j< studentMarks.length-i;j++){
                if(studentMarks[j]<studentMarks[j-1]){
                    int temp=studentMarks[j];
                    studentMarks[j]=studentMarks[j-1];
                    studentMarks[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(studentMarks));
    }
}
