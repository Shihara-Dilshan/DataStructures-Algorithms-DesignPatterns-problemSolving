package org.example.problemSolving.warmup;

import java.util.Arrays;
import java.util.List;

/*
Given an array of integers, find the sum of its elements.
For example, if the array, so return .
Function Description
Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
simpleArraySum has the following parameter(s):
ar: an array of integers
Input Format
The first line contains an integer, denoting the size of the array.
The second line contains  space-separated integers representing the array's elements.
Constraints

Output Format
Print the sum of the array's elements as a single integer.
Sample Input
    6
    1 2 3 4 10 11
Sample Output
    31
*/
class ResultSimpleArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;

        //Handle edge cases
        if(ar.isEmpty()){
            return 0;
        }else{
            for (Integer integer : ar) {
                sum += integer;
            }
        }
        return sum;
    }

}
public class SimpleArraySum {
    public static void main(String[] args) throws Exception  {
        int result = ResultSimpleArraySum.simpleArraySum(Arrays.asList(5 ,6 ,7));
        System.out.println(result);
    }
}
