#include <cstdio>
int main()
{
    unsigned long long n,k,c;
    c = 0;
    unsigned long long z =0;
    while(scanf("%llu%llu",&n,&k)!=EOF){
        c = n;
        while(c>=k){
            z=c/k;
            c=c%k;
            n+=z;
            c+=z;
            }
        printf("%llu\n",n);
        }
}
