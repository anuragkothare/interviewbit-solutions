// Add One To Number

// https://www.interviewbit.com/problems/add-one-to-number/


public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1;
        ArrayList<Integer> result = new ArrayList<>(A);
        int len = A.size();
        for(int i = len-1;i>=0;i--) {
            if(carry == 0) {
                break;
            }
            int digit = A.get(i);
            int num = digit + carry;
            if (num >= 10) {
                carry = num / 10;
                digit = num % 10;
            }
            else {
                carry = 0;
                digit = num;
            }
            result.set(i, digit);
        }
        if(carry != 0) {
            result.add(0, 1);
        }
        int index = 0;
        while (index < result.size() && result.get(index) == 0) {
            result.remove(index);
        }

        return result;
    }
}