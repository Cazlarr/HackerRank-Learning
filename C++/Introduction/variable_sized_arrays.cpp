//https://www.hackerrank.com/challenges/variable-sized-arrays/problem
#include <vector>
#include <iostream>


int main() {
    int n, q, size, val;
    std::cin >> n >> q;
    std::vector<std::vector<int>> arr;
    for (int i = 0; i < n; i++) {
        std::vector<int> thisVec;
        std::cin>>size;
        for (int j = 0; j<size; j++) {
            std::cin>>val;
            thisVec.push_back(val);
        }
        arr.push_back(thisVec);
    }
    
    for (int i = 0; i < q; i++) {
        int x, y;
        std::cin>>x>>y;
        std::cout<<arr[x][y]<<std::endl;
    }
    return 0;
}

/*
This was the only tutorial problem I struggled a little with - because I misread the inputs!
I kept struggling with std::getline() to try and read in the full line and then convert it to int, 
instead of using the first value of each input array as its size.

Thank you Xingshanxie for pushing me back on track with their solution:
https://www.hackerrank.com/challenges/variable-sized-arrays/forum/comments/249124
*/