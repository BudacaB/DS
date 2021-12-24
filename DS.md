# Data structures

https://www.youtube.com/playlist?list=PLDV1Zeh2NRsB6SWUrDFW2RmDotAfPbeHu

https://github.com/williamfiset/Algorithms

<br>

## What is a Data Structure?
- A data structure (DS) is a way of organizing data so that it can be used effectively.

## Why data structures?
- They are essential ingredients in creating fast and powerful algorithms
- They help manage and organize data
- They make code cleaner and easier to understand

## Abstract Data Types vs. Data Structures
- An <b>abstract data type</b> (ADT) is an abstraction of a data structure which provides only the interface to which a data structure must adhere to.
- The interface does not give any specific details about how something should be implemented or in what programming language
- Examples:

| Abstraction (ADT) | Implementation (DS) |
| ---- | ----- |
| List |  Dynamic Array<br>Linked List | 
| Queue | Linked List based Queue<br>Array based Queue<br>Stack Based Queue |
| Map | Tree Map<br>Hash Map / Hash Table |
| Vehicle | Gold Cart<br>Bicycle<br>Smart Car |

## Computational Complexity Analysis
- How much <b>time</b> does this algorithm need to finish?
- How much <b>space</b> does this algorithm need for its computation?

## Big-O Notation
- Big-O notation gives an upper bound of the complexity in the <b>worst</b> case, helping to quantify performance as the input size becomes <b>arbitrarily large</b>
- Complexities ordered in from smallest to largest (n - the size of the input):
    - Constant Time: O(1)
    - Logarithmic Time: O(log(n))
    - Linear Time: O(n)
    - Linearithmic Time: O(nlog(n))
    - Quadric Time: O(n<sup>2</sup>)
    - Cubic Time: O(n<sup>3</sup>)
    - Exponential Time: O(b<sup>n</sup>), b > 1
    - Factorial Time: O(n!)

## Big-O Properties
- O(n + c) = O(n)
- O(cn) = O(n), c > 0
- Let f be a function that describes the running time of a particular algorithm for an input of size n: <br>
f(n) = 7log(n)<sup>3</sup> + 15n<sup>2</sup> + 2n<sup>3</sup> + 8 <br>
O(f(n)) = O(n<sup>3</sup>)

## Big-O Examples
- The following run in <b>constant</b> time O(1): <br>
a := 1 <br>
b := 2 <br>
c := a + 5*b <br><br>
i := 0 <br>
While i < 11 Do <br>
&nbsp;&nbsp;&nbsp; i = i + 1 <br>
    - ! They don't depend on n

- The following run in <b>linear</b> time O(n): <br>
i := 0 <br>
While i < n Do <br>
&nbsp;&nbsp;&nbsp; i = i + 1 <br>
f(n) = n <br>
O(f(n)) = O(n) <br><br>
i := 0 <br>
While i < n Do
&nbsp;&nbsp;&nbsp; i = i + 3 <br>
f(n) = n/3 <br>
O(f(n)) = O(n)

- Both of the following run in <b>quadratic</b> time. The first may be obvious since <em>n</em> work done <em>n</em> is n\*n = O(n<sup>2</sup>), but what about the second one? <br>
For (i := 0; i < n; i = i + 1) <br>
&nbsp;&nbsp;&nbsp; For (j := 0; j < n; j = j + 1) <br>
f(n) = n\*n = n<sup>2</sup>, O(f(n)) = O(n<sup>2</sup>) <br><br>
For (i := 0; i < n; i = i + 1) <br>
&nbsp;&nbsp;&nbsp; For (j := i; j < n; j = j + 1) -> replaced 0 with i <br>
Since <em>i</em> goes from [0,n) the amount of looping done is directly determined by what <em>i</em> is. Remark that if <b><em>i=0</em></b>, we do <em>n</em> work, if <em>i=1</em>, we do <em>n-1</em> work, if <em>i=2</em>, we do <em>n-2</em> work, etc. <br>
So the question then becomes what is (n) + (n-1) + (n-2) + (n-3) + ... + 3 + 2 + 1? Remarkably this turns out to be <em>n(n+1)/2</em>, so O(n(n+1)/2) = O(n<sup>2</sup>/2 + n/2) = <b>O(n<sup>2</sup>)</b> <br><br>
Another example is of an outer loop that does <em>n</em> work and two inner loops that do <em>3n</em> work and <em>2n</em> work. Generally speaking, we multiply loops on different levels and we add those on the same level <br>
i := 0 <br>
While i < n Do <br>
&nbsp;&nbsp;&nbsp; j = 0 <br>
&nbsp;&nbsp;&nbsp; While j < 3\*n Do <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; j = j + 1 <br>
&nbsp;&nbsp;&nbsp; j = 0 <br>
&nbsp;&nbsp;&nbsp; While j < 2\*n Do <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; j = j + 1 <br>
&nbsp;&nbsp;&nbsp; i = i + 1 <br>
f(n) = n * (3n + 2n) = 5n<sup>2</sup> <br>
O(f(n)) = <b>O(n<sup>2</sup>)</b> <br><br>
And again similar but not the same: <br>
i := 0 <br>
While i < 3\*n Do <br>
&nbsp;&nbsp;&nbsp; j := 10 <br>
&nbsp;&nbsp;&nbsp; While j <=50 Do <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; j = j + 1 <br>
&nbsp;&nbsp;&nbsp; j = 0 <br>
&nbsp;&nbsp;&nbsp; While j < n\*n\*n Do <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; j = j + 2 <br>
&nbsp;&nbsp;&nbsp; i = i + 1 <br>
f(n) = 3n * (40 + n<sup>3</sup>/2) = 120n + 3n<sup>4</sup>/2 <br>
O(f(n)) = <b>O(n<sup>4</sup>)</b> <br><br>

- <b>Logarithmic</b> time. Suppose we have a sorted array and we want to find the index of a particular value in the array, if it exists. What is the time complexity of the following algorithm? <br>
low := 0 <br>
high := n-1 <br>
While low <= high Do <br>
&nbsp;&nbsp;&nbsp; mid := (low + high) / 2 <br>
&nbsp;&nbsp;&nbsp; If array[mid] == value: return mid <br>
&nbsp;&nbsp;&nbsp; Else If array[mid] < value: low = mid + 1 <br>
&nbsp;&nbsp;&nbsp; Else If array[mid] > value: high = mid - 1 <br>
return -1 // Value not found <br><br>
Answer: O(log<sub>2</sub>(n)) = <b>O(log(n))</b> -> we discard half of the array on every iteration

- Other examples:
    - Finding all subsets of a set - O(n<sup>2</sup>)
    - Finding all permutations of a string - O(n!)
    - Sorting using mergesort - O(nlog(n))
    - Iterating over all the cells in a matrix of size n by m - O(nm) 