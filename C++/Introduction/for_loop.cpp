//https://www.hackerrank.com/challenges/c-tutorial-for-loop/problem

#include <iostream>


int main()
{
    int a, b;

    std::string outs[] = {"even", "odd", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"};

    for (std::cin >> a >> b; a <= b; a++) {
        std::cout << outs[((a>9) ? a%2 : a+1)] << std::endl;
    }

    return 0;
}

/*
Credit to JChiquin for showing that I can put the `cin` input into the for loop statement 1:
https://www.hackerrank.com/challenges/c-tutorial-for-loop/forum/comments/281664

It's a nice way of saving a line of code, but I think it makes it a little less readable.
Other than that I came to this solution on my own - I've just about finished re-learning C++!
*/
