function recursiveFibonacci(n) {
    if (n === 0) {
        return 0;
    }
    if (n === 1) {
        return 1;
    }
    let r = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    console.log("n = " + n + ", tulemus " + r); 
    return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
}

const n = 6; 
const result = recursiveFibonacci(n);
console.log("Fibonacci number at position " + n + " is " + result);
