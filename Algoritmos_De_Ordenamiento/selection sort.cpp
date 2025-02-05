#include <iostream>

using namespace std;

int main()
{
    cout<<"prueba de selection sort \n ";
    int i,j,index,min;
    
    int a[]={5,12,7,7,1,6,2,8,0,12,4,7,9,4};
	int n=14;
    //selection sort
    for(i=0;i<n;i++){
        min=a[i];
        index=i;
        for(j=(i+1);j<n;j++){
            if(min>a[j]){
                min=a[j];
                index=j;
            }
        }
        a[index]=a[i];
        a[i]=min;
    }
    
    
    for(i=0;i<n;i++){
        cout<<"\n"<<a[i];
    }
    return 0;
}
