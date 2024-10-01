
function canArrange(input: number[], divisor: number): boolean {
    const frequency: number[] = new Array(divisor + 1).fill(0);
    for (let value of input) {
        const remainder = ((value % divisor) + divisor) % divisor;
        ++frequency[remainder];
    }

    if (frequency[0] % 2 !== 0) {
        return false;
    }
    for (let i = Math.floor(divisor / 2); i >= 1; --i) {
        if (frequency[i] !== frequency[divisor - i]) {
            return false;
        }
    }

    return true;
};
