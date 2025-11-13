n,m = map(int,input().split())

bucket = list(range(1,n+1))


for k in range(m):
    i,j = map(int,input().split())
    bucket[i-1],bucket[j-1] = bucket[j-1] , bucket[i-1]

for a in bucket:
    print(a,end=" ")