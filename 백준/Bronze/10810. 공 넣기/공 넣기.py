n,m = map(int, input().split())

bucket = [0]*n # 바구니를 n개 만큼 만들어

for _ in range(m):
    i,j,k = map(int, input().split())
    # i,j는 i부터 j 바구니 까지 k개씩 넣기
    for index in range(i,j+1):
        #index를 기준으로 잡아 i번째 부터 j번째까지 j+1은 배열 문제 4를 5로 만들기 위함.
        bucket[index-1] = k
        # 1 2 3이라면  bucket 0,1에 3개씩 넣기
for i in range(n):
    print(bucket[i],end=" ")
    # bucket 0~4까지 4개 바구니 모두 보기