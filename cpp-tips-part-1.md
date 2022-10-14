## Some basic tips for C++ coding in CP contests: 
### 1) Checking if the number is even or odd without using the % operator: 
Although this trick is not much better than using the % operator but is sometimes efficient (with large numbers). Use & operator: 

if (num & 1)
   cout << "ODD";
else
   cout << "EVEN";

Example: num = 5 Binary: “101 & 1” will be 001, so true num = 4 Binary: “100 & 1” will be 000, so false. 

### 2) Fast Multiplication or Division by 2 Multiplying by 2 means shifting all the bits to left and dividing by 2 means shifting to the right. 
Example : 2 (Binary 10): shifting left 4 (Binary 100) and right 1 (Binary 1) 

// Multiply n with 2
n = n << 1;
 
// Divide n by 2
n = n >> 1;

### 3) Swapping of 2 numbers using XOR: This method is fast and doesn’t require the use of 3rd variable. 

// A quick way to swap a and b
a ^= b;
b ^= a;
a ^= b;
