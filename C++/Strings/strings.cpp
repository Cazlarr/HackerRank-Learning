// https://www.hackerrank.com/challenges/c-tutorial-strings/problem

#include <iostream>
#include <string>
using namespace std;

int main() {
    string str1, str2;
    char tmp;
    cin >> str1 >> str2;
    cout << str1.size() << " " << str2.size() << endl;
    cout << str1 + str2 << endl;
    tmp = str1[0];
    str1[0] = str2[0];
    str2[0] = tmp;
    cout << str1 << " " << str2;

    return 0;
}