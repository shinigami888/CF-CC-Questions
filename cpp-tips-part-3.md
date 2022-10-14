1) Maximum size of the array: We must be knowing that the maximum size of the array declared inside the main function is of the order of 10^6,
but if you declare the array globally then you can declare its size up to 10^7. 

2) Calculating the most significant digit: To calculate the most significant digit of any number log can be directly used to calculate it. We can calculate the number of digits and then divide the number by 10^(number of digits-1)

Suppose the number is N then 
Let int K = log10(N); // number of digits in a number=log10(N)+1
And int X = pow(10, K);
Then int ans=N/X will be the most significant digit

#include <bits/stdc++.h>
using namespace std;
 
int MSD(int n){
      if(n == 0)
        return 0;
      int k = log10(n);
    int x = pow(10,k);
    int ans = n/x;
      return ans;
}
 
int main() {
    int n;
    cin >> n;
    cout << MSD(n) << endl;
    return 0;
}

10) Calculating the number of digits directly: To calculate the number of digits in a number, instead of looping you can efficiently use log :

Number of digits in N =floor(log10(N)) + 1;  

11) Efficient trick to know if a number is a power of 2 using the normal technique of division the complexity comes out to be O(logN), but it can be solved using O(v) where v is the number of digits of the number in binary form. 

// Function to check if x is power of 2
bool isPowerOfTwo (int x)
{
  // First x in the below expression is
     for the case when x is 0 //
  return x && (!(x&(x-1)));
}

12) C++11 has inbuilt algorithms for the following:

       // are all of the elements positive?
       all_of(first, first+n, ispositive()); 

      // is there at least one positive element?
      any_of(first, first+n, ispositive());

      // are none of the elements positive?
      none_of(first, first+n, ispositive()); 
