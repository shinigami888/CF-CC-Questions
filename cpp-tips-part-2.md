### 1) Avoiding the use of strlen(): 

Use of strlen() can be avoided by:
for (i=0; s[i]; i++)
{
}
loop breaks when the character array ends.

### 2) Use of emplace_back(): 
Instead of push_back() in STL emplace_back can be used because it is much faster and instead of allocating memory somewhere else and then appending it directly allocates memory in the container. 

### 3) Inbuilt GCD function: C++ has an inbuilt GCD function and there is no need to explicitly code it. 
Syntax: __gcd(x, y); 

### 4) Using Inline functions: We can create inline functions and use them without having to code them up during the contest. 
Examples: (a) function for sieve, (b) function for palindrome. 
