
package main

import "fmt"

func canArrange(input []int, divisor int) bool {
    frequency := make([]int, divisor+1)
    for _, value := range input {
        remainder := ((value % divisor) + divisor) % divisor
        frequency[remainder]++
    }

    if frequency[0] % 2 != 0 {
        return false
    }
    for i := divisor / 2; i >= 1; i-- {
        if frequency[i] != frequency[divisor - i] {
            return false
        }
    }

    return true
}
