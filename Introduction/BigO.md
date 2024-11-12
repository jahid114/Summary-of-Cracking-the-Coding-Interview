# Big-O Notation Summary
## Definition
Big-O notation describes the upper bound ( similar to less than or equal to ) of the time complexity in the worst case, helping to analyze the scalability and efficiency of algorithms.
## Common Time Complexities
| Notation | Name | Example |
|----------|------|---------|
| O(1) | Constant | Array access |
| O(log n) | Logarithmic | Binary search |
| O(n) | Linear | Simple search |
| O(n log n) | Linearithmic | Efficient sorting (e.g., mergesort) |
| O(n²) | Quadratic | Nested loops |
| O(2ⁿ) | Exponential | Recursive fibonacci |
## Key Points
### Time Complexity
- Drop constants: O(2n) becomes O(n)
- Drop non-dominant terms: O(n² + n) becomes O(n²)
- Different inputs use different variables: O(a + b) instead of O(n + m)
- Amortized time: Consider average time over many operations
### Space Complexity
- Parallel to time complexity but measures memory usage
- Recursive calls add to space complexity due to call stack

### What is the difference between Best, Average, and Worst Cases & Big-O, Omega, and Theta?
- Best, Average, and Worst Cases describe the Big-O time for particular inputs or scenarios.
- Big-O, Omega, and Theta the upper, lower, and tight bound of the time complexity for all inputs.
