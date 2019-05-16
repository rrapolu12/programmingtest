#General Test
#####
Q1 : The Fibonacci sequence is defined as a sequence of integers starting with 1 and 1, where each
     subsequent value is the sum of the preceding two. I.e.
     f(0) = 1
     f(1) = 1
     f(n) = f(n-1) + f(n-2) where n >= 2
     Write a program in a language of your choice to calculate the sum of the first 100 even-valued
     Fibonacci numbers

Scala Language

def fibonacci(n: Int): Int = {
    case 0 | 1 => 1
    case _ if n > 2 => fibonacci(n - 1) + fibonacci(n - 2)
  }

Ref Code: Fibonacci.scala

#####
`Q2. Describe 3 different data structures that could be used to implement an associative array where
    both the keys and values are strings, and comment on their relative advantages and
    disadvantages`
    
`Answer`
`3 Data Structures are 
1) Hashtables 
**Time Complexity ** : 

Advantages : 
                    1) lookup: 0(1)
                    2) Insertion : O(1)
                    3) Deletion - O(1)
Disadvantages : 
                    1) Lookup O(n)
                    2) Insertion : O(n)
                    3) Deletion :  O(n)
2) Self-Balancing Binary Search Tree: 
**Time Complexity** : 
Advantages : 
                    1) Lookup : O(logn) 
                    2) Insertion : O(logn)
                    3) Deletion - O(logn)
Disadvantages : 
                    1) Lookup : O(logn) 
                    2) Insertion : O(logn)
                    3) Deletion - O(logn)

3) unBalanced Binary Search Tree: 
**Time Complexity** : 
Advantages : 
                    1) Lookup : O(logn) 
                    2) Insertion : O(logn)
                    3) Deletion - O(logn)
Disadvantages : 
                    1) Lookup : O(n) 
                    2) Insertion : O(n)
                    3) Deletion - O(n)
`

#####
Q3: 
Write a function in a language of your choice that merges two sorted lists into a new sorted list.
E.g. [1,4,6],[2,3,5] → [1,2,3,4,5,6].

Ref Code: MergeSortArrays.scala

