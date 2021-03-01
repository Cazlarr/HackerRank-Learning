//https://www.hackerrank.com/challenges/arrays-introduction/problem
#include <iostream>


int main() {
    int n;
    std::cin>>n;
    int a[n];
    for (int i = 0; i < n; i++) {
        std::cin>>a[i];
    }  
    for (int j = n-1; j >= 0; j--) {
        std::cout << a[j] << " ";
    }
    return 0;
}

/*
The discussions for this tutorial problem are all about doing this with "proper" C++.
For me, if it compiles without C libraries being included, it's C++.

I had seen C++ input loops like JChiquin used in the discussion which I like:
https://www.hackerrank.com/challenges/arrays-introduction/forum/comments/281696

It would change my for loop to:

    int i = 0;
    while(std::cin>>a[i++]);
    while(std::cout<<a[--n]<<" " && n);

Which is nice and compact. I'll look for opportunities to loop for cin like this in the future.
*/