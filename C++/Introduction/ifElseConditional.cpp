//https://www.hackerrank.com/challenges/c-tutorial-conditional-if-else/problem
/*
Original submission:

#include <bits/stdc++.h>


int main()
{
    int n;
    std::cin >> n;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

    switch(n) {
        case 1:
            std::cout << "one" << std::endl;
            break;
        case 2:
            std::cout << "two" << std::endl;
            break;
        case 3:
            std::cout << "three" << std::endl;
            break;
        case 4:
            std::cout << "four" << std::endl;
            break;
        case 5:
            std::cout << "five" << std::endl;
            break;
        case 6:
            std::cout << "six" << std::endl;
            break;
        case 7:
            std::cout << "seven" << std::endl;
            break;
        case 8:
            std::cout << "eight" << std::endl;
            break;
        case 9:
            std::cout << "nine" << std::endl;
            break;
        default:
            std::cout << "Greater than 9" << std::endl;
    }

    return 0;
}

*/
//Answer by: https://www.hackerrank.com/coder_aky
#include <bits/stdc++.h>


int main()
{
    int n;
    std::cin >> n;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

    std::string outs[] = {"Greater than 9", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"};
    
    std::cout << outs[((n>9)?0:n)] << std::endl;

    return 0;
}

/*
When I first saw this problem, my knee-jerk reaction was to use a switch statement instead of a long list if `if else` statements.
That reaction to use a more purpose built conditional tool (other than if/else which was being taught by this problem) resulted in me 
overlooking the use of an array with a single if/else conditional!

This solution is my version of what coder_aky uses, prefering to resolve the index directly into the array call rather than having 
two different array calls as statements:
https://www.hackerrank.com/challenges/c-tutorial-conditional-if-else/forum/comments/685397
*/
