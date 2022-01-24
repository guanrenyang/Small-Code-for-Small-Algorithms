# Disjoint-Set
Aims to implement disjoint set in multiple languages.
# Language Support
- [x] Java
- [x] cpp
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
1. Current implementation uses a one-dimensional array, and the constructor needs to pass in the size of this array($n$). $n$ nodes are represented by $1,2,\cdots,n-1$, which means that **every element must have a numerical number**.
2. Current implementation **doesn't support dynamic adding or deleting**.

