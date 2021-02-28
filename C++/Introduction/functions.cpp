// https://www.hackerrank.com/challenges/c-tutorial-functions/problem

#include <iostream>

int max_of_four(int a, int b, int c, int d) {
    int max = (a>b ? a : b);
    return(c>d ? (max>c ? max : c) : (max>d ? max : d));    
}

int main() {
    int a, b, c, d;
    std::cin >> a >> b >> c >> d;
    int ans = max_of_four(a, b, c, d);
    std::cout << ans << std::endl;
    
    return 0;
}

/*
My favourite answer from the discussion is Maggotfinger's:
https://www.hackerrank.com/challenges/c-tutorial-functions/forum/comments/255329

It adds a new function called `max_of_two` which is called by `max_of_four`. It's a great answer for the "functions" tutorial 
problem as it uses more functions in an elegant and readable way.

It does however take 4 comparisons to complete, making it 33% more expensive than my 3 comparisons... ;)
*/
