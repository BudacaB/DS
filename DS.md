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

- The following run in <b>linear</b> time O(n):
