// https://www.hackerrank.com/challenges/cpp-hello-world/problem
/*
Original submission:

#include <iostream>
using namespace std;

int main() {
    cout << "Hello, World!";
    return 0;
}

* Replaced printf() for cout, as I thought cout would give more intuitive control of output.
*/

// Answer by: https://www.hackerrank.com/Ethan13310
#include <iostream>

int main()
{
    std::cout << "Hello, World!" << std::endl;
    return 0;
}

/*
Ethan explains that printf() is a C function, so cout is a more C++ solution version of Hello World.
They additionally explain that using namespace when it is not mandatory can lead to multiple definitions in large projects, 
so it is a habit I wish to avoid.
*/