//Question 1: Young Physicist
#include <iostream>
using namespace std;
 
int main() {
	int t;
 
	cin >>t;
	int arr[3] ={0};
	int a[3]={0};
	while(t--){
      for(int i=0; i<3; i++){
      	cin>>a[i];
      	a[i] = a[i]+arr[i];
      	arr[i]= a[i];
      }
	}
	
	if (a[0] ==0 && a[1]==0 && a[2]==0)
 
		cout<<"YES";
	else 
		cout<<"NO";
	return 0;
}

//Question 2: Beautiful Matrix 
#include <iostream>
using namespace std;
 
int main() {
	int a=0;
	int arr[6][6];
	
	for(int i=1; i<=5; i++){ 
       for(int j=1; j<=5; j++){
             cin>>arr[i][j];
       }
    }
	
     for(int i=1; i<=5;i++ )
     {
         for(int j=1;j<=5;j++){
             if(arr[i][j]==1){
                
                a=abs(3-i)+abs(3-j);
                cout<<a;
               return 0;
           }         
        }
    }
}

//Question 3: Beautiful year 
#include <iostream>
using namespace std;
 
int main() {
	int yr;
	cin>>yr;
	while(true){
	    yr++;
	    int a = yr/1000;
	     int b = yr/100 %10;
	      int c = yr/10 %10;
	       int d = yr%10;
	       if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
	           cout<<yr;
	           break;
	       }
	  }
}

//Question 4: Queue at the school 
#include <iostream>
using namespace std;
 
int main() {
	int n,t;
	cin>>n>>t;
	char arr[n];
	for(int i=0; i<n;i++){
	    cin>>arr[i];
	}
	while(t--){
	   
	   for(int i=1; i<n; i++){
	       if(arr[i]=='G' && arr[i-1]=='B')
	       {
	           arr[i]='B';
	           arr[i-1]='G';
           i++;
	       }
	       
	   }  
	}
 	for(int i=0; i<n;i++){
	    cout<<arr[i];
	}
}

//Question 5: Lights out 
#include <iostream>
using namespace std;
 
int main() {
	// your code goes here
	int a;
	int arr[3][3];
	int res[3][3]={1,1,1,1,1,1,1,1,1};
	for(int i=0; i<3; i++){
	    for(int j=0; j<3; j++){
	        cin>>arr[i][j];
	    }
	}
	
		for(int i=0; i<3; i++){
	    for(int j=0; j<3; j++){
	        if(arr[i][j] %2 == 1){
	            res[i][j]= res[i][j]^ 1;
	            if((j-1)>=0)
	            {
	                res[i][j-1]=res[i][j-1] ^ 1;
	            }
	             if((i-1)>=0)
	            {
	                res[i-1][j]=res[i-1][j] ^ 1;
	            }
	             if((j+1)<=2)
	            {
	                res[i][j+1]=res[i][j+1] ^ 1;
	            }
	             if((i+1)<=2)
	            {
	                res[i+1][j]=res[i+1][j] ^ 1;
	            }
	        }
	    }
	}
		for(int i=0; i<3; i++){
	    for(int j=0; j<3; j++){
	        cout<<res[i][j];
	    }
	    cout<<endl;
	}
	
}

//End of A2OJ Ques 1-5

