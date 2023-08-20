package org.example.problemSolving.warmup;

/*
Staircase detail
This is a staircase of size :
           #
          ##
         ###
        ####
Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
Write a program that prints a staircase of size .
Function Description
Complete the staircase function in the editor below.
staircase has the following parameter(s):
int n: an integer
Print a staircase as described above.
Input Format
A single integer, denoting the size of the staircase.
Constraints
Output Format
Print a staircase of size  using # symbols and spaces.
Note: The last line must have  spaces in it.
Sample Input
         6
Sample Output
         #
        ##
       ###
      ####
     #####
    ######
 */
class ResultStaircase {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void staircase(int n) {
        for(int i=0; i < n;i++){
            int temp = n - 1 - i;
            for(int j=0; j < n;j++){
                if(j < temp){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println(" ");
        }
    }
}

public class Staircase {
    public static void main(String[] args)  {
        ResultStaircase.staircase(6);
    }
}
