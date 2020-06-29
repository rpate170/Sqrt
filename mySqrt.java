class Solution {
    public int mySqrt(int x) {
        //return (int)Math.sqrt(x);
        long result = x;
        while (result * result > x) {
            result = (result + (x/result))/2;
        }
        return (int)result;
    }
}