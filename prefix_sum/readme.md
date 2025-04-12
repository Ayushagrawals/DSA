prefix sum is calculated from -

prefix[i]=prefix[i-1]+A[i];
if we want to calculate array
A[i]=prefix[i]-prefix[i-1];
if prefix array is [-2,4,1,5,2]
A[0]=prefix[0];
A[1]=4-(-2-=6
a[2]=1-4=-3
a[3]=5-1=4
A[4]=2-5=-3
A=[-2,6,-3,4,-3]
