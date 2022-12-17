import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = Arrays.stream(numbers).max().orElse(0);
        
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] == max1) {
                numbers[i] = -1;
                break;
            }
        int max2 = Arrays.stream(numbers).max().orElse(0);
        
        answer = max1 * max2;

        return answer;
    }
}
