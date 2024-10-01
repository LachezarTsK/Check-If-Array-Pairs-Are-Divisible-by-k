
public class Solution {

    public boolean canArrange(int[] input, int divisor) {
        int[] frequency = new int[divisor + 1];
        for (int value : input) {
            int remainder = ((value % divisor) + divisor) % divisor;
            ++frequency[remainder];
        }

        if (frequency[0] % 2 != 0) {
            return false;
        }
        for (int i = divisor / 2; i >= 1; --i) {
            if (frequency[i] != frequency[divisor - i]) {
                return false;
            }
        }

        return true;
    }
}
