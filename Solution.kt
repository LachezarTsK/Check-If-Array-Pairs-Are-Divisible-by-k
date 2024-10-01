
class Solution {

    fun canArrange(input: IntArray, divisor: Int): Boolean {
        val frequency = IntArray(divisor + 1)
        for (value in input) {
            val remainder = ((value % divisor) + divisor) % divisor
            ++frequency[remainder]
        }

        if (frequency[0] % 2 != 0) {
            return false
        }
        for (i in (divisor / 2) downTo 1) {
            if (frequency[i] != frequency[divisor - i]) {
                return false
            }
        }

        return true
    }
}
