// https://www.hackerrank.com/challenges/c-tutorial-pointer/problem

#include <stdio.h>
#include <stdlib.h>

void update(int *a,int *b) {
    int temp = *a + *b;
    *b = abs(*a - *b);
    *a = temp;    
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}

/*
Researching this tutorial problem showed there is a discussion in the C++ community over the use of pointers.
There's people like Ethan, saying how it's mainly used for interfacing with C libraries:
https://www.hackerrank.com/challenges/c-tutorial-pointer/forum/comments/246290

(He included some nice ways of using them when you have to!)

And then there's people like Rishi, who are more poetic about their use:
"We use pointers because it's easier to give someone an address to your home than to give a copy of your home to everyone. 
– Rishi Dua Oct 4 '13 at 14:51"
(https://stackoverflow.com/questions/162941/why-use-pointers)

I like both their viewpoints - pointers are good for optimisation when using large data structures, but should be avoided where possible.
*/
