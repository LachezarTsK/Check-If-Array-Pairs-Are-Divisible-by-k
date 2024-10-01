
using System;

public class Solution
{
    public bool CanArrange(int[] input, int divisor)
    {
        int[] frequency = new int[divisor + 1];
        foreach (int value in input)
        {
            int remainder = ((value % divisor) + divisor) % divisor;
            ++frequency[remainder];
        }

        if (frequency[0] % 2 != 0)
        {
            return false;
        }
        for (int i = divisor / 2; i >= 1; --i)
        {
            if (frequency[i] != frequency[divisor - i])
            {
                return false;
            }
        }

        return true;
    }
}
