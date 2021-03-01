// https://www.hackerrank.com/challenges/cpp-input-and-output/problem
/*
Original submission:

#include <iostream>


int main() {
    int a, b, c;
    std::cin >> a >> b >> c;
    std::cout << (a+b+c) << std::endl;   
    return 0;
}

*/
// Answer for variable input by: https://www.hackerrank.com/gitipiti

#include <iostream>


int main() {
    int i;
    int sum;
    while (std::cin >> i) sum += i;
    std::cout << sum << std::endl;   
    return 0;
}

/* 
I like the iterative input and summing as you go. 
The only difference is you need an EOF or Ctrl-C to end the input stream.
*/