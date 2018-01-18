// Min Steps in Infinite Grid
// https://www.interviewbit.com/problems/min-steps-in-infinite-grid/


// SOLUTION 1
public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int len=A.length;
        int sum=0;
        for(int i=0;i<(len-1);i++)
        {
            int num1;
            if(A[i+1]>=A[i])
                num1 = A[i+1]-A[i];
            else
                num1 = A[i]-A[i+1];
            int num2;
            if(B[i+1]>=B[i])
                num2 = B[i+1]-B[i];
            else
                num2 = B[i]-B[i+1];
            sum = sum + Math.max(num1,num2);
        }
        return sum;
    }
}




// SOLUTION 2
public class Solution {
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numSteps = 0;
        for(int i = 1; i < X.size(); i++){
            numSteps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) ); 
        }
        return numSteps;
    }
}
