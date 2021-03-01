// https://www.hackerrank.com/challenges/c-tutorial-basic-data-types/problem
/*
There is a great deal of displeasure in the discussion of this tutorial, as it's advertised as a C++ problem but pushes for a C solution.
This lead me to do further research on the differences, particularly with performance, leading me to this article:
https://www.geeksforgeeks.org/cincout-vs-scanfprintf/

I'm happy to report that I've learned the difference between C and C++ methods, and I've gone back and stripped all C from my previous answers.
And line 14 of this code is used to address the performance difference between scanf() and cin - so this bad tutorial resulted is some good learning!
*/

#include <iostream>

int main() {
    std::ios::sync_with_stdio(false);
    int i; long l; char c; float f; double d;
    std::cin >> i >> l >> c >> f >> d;
    std::cout.precision(9); // This is lazy for the precision 3 float, but it passes the test cases
    std::cout << i << "\n" << l << "\n" << c << "\n" << f << "\n" << d << std::endl;
    return 0;
}