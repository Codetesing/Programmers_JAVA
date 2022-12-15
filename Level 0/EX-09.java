class Solution {
    public int solution(int num1, int num2) {
        double t = (num1 / (double)num2) * 1000;
        
        return (int)Math.floor(t);
    }
}
