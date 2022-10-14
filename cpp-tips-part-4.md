1) Copy Algorithm: used to copy elements from one container to another.

int source[5] = {0, 12, 34, 50, 80};
int target[5];
// copy 5 elements from source to target
copy_n(source, 5, target);

Please refer Array algorithms in C++ STL (all_of, any_of, none_of, copy_n and itoa) for details. 

2) The Iota Algorithm The algorithm iota() creates a range of sequentially increasing values, as if by assigning an initial value to 
*first, then incrementing that value using prefix ++. In the following listing, iota() assigns the consecutive values {10, 11, 12, 13, 14} to the array arr, and {‘a’, ‘b’, ‘c’} to the char array c[]. 

int a[5] = {0};
char c[3] = {0};
 
// changes a to {10, 11, 12, 13, 14}
iota(a, a+5, 10);
iota(c, c+3, 'a'); // {'a', 'b', 'c'}

Please refer Array algorithms in C++ STL (all_of, any_of, none_of, copy_n and itoa) for details. 

3) Initialization in Binary form: In C++ 14 assignments can also be made in binary form. 

// C++ code to demonstrate working of
// "binary" numbers
#include<iostream>
using namespace std;
int main()
{
    auto number = 0b011;
    cout << number;
    return 0;
}

Output :
3

4) Use of “and” Though not a very productive one, this tip helps you to just use conditional operator and instead of typing &. 

// C++ code to demonstrate working of "and"
#include<iostream>
using namespace std;
int main()
{
    int a = 10;
    if (a < 20 and a > 5)
      cout << "Yes";
    return 0;
}
