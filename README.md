# Small Code for Small Algorithms

实现了刷题过程中的遇到的一些常见算法。

*如果使用了类`class`，则将所有的成员函数的实现写在类内，使其复制到[LeetCode](https://leetcode-cn.com/)上更为方便。*
*All the member functions are implemented inside the class to be used in online judge platform such as [LeetCode](https://leetcode-cn.com/)*.
# Algorithms
- [x] 并查集(Disjoint Set)
- [x] 多种二分查找(Binary Search)
# Language Support
- [x] cpp (所有算法都至少使用C++实现)
- [x] Java
- [ ] ...
# TODO
- [x] **Union** two elements
- [x] Test **connectivity** of two nodes
- [x] Return **number** of disjoint sets
- [x] Create disjoint sets in **construction**
- [ ] Dynamically **add** elements
- [ ] Dynamically **delete** elements
- [ ] Increase the **generalizability** of the implementations.

# Tips

You can use the following steps to t**urn the actual problem into a disjoint set** in my implementation：

1. Give a numerical number to each element in the problem
2. Count the total number of elements, `n`
3. Given `n`, create a disjoint set.
4. Add relationships using function `Union`
5. *Further specific work*

# Miscellaneous  
1. Current implementation uses a one-dimensional array, and the constructor needs to pass in the size of this array(`n`). `n` nodes are represented by `1,2,···,n-1`, which means that **every element must have a numerical number**.
2. Current implementation **doesn't support dynamic adding or deleting**.

