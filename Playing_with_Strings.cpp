// Chef usually likes to play cricket, but now, he is bored of playing it too much, 
// so he is trying new games with strings. Chef's friend Dustin gave him binary strings S and R, each with length N, 
// and told him to make them identical. However, unlike Dustin, Chef 
// does not have any superpower and Dustin lets Chef perform only 
// operations of one type: choose any pair of integers (i,j) such that 1 <= i, j <= N1≤i,j≤N and swap the i-th and j-th 
// character of S. He may perform any number of operations (including zero).

// For Chef, this is much harder than cricket and he is asking for your help. Tell him whether it is possible to change the string SS to the target string RR only using operations of the given type.

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of TT test cases follows.
// The first line of each test case contains a single integer N.
// The second line contains a binary string S.
// The third line contains a binary string R.

// Output
// For each test case, print a single line containing the string "YES" if it is possible to change S to R or "NO" if it is impossible (without quotes).

// Constraints
// 1 <= T <= 400 
// 1 <= N <= 100
// |S| = |R| = N
// S and R will consist of only '1' and '0'

#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	
	while(t--){
	    int z;
	    cin>>z;
	    int count = 0;
	    int count1 = 0 ;

	    string xBinary , yBinary;
	    cin>>xBinary;
	    cin>>yBinary;
	    
	    for(int i =0 ; i < z; i++){
	        
	        if (xBinary[i] == '0'){
	            count++;
	        }
	        if (yBinary[i] == '0'){
	            count1++;
	        }
	    }
	   
	    if(count == count1){
	        cout<<"YES"<<endl;
	    }else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}
