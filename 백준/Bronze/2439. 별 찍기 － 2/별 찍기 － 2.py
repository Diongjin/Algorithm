T = int(input())


for i in range(T):
    for j in range(T-i-1):
        print(end=" ")
    for k in range(i+1):
        print("*",end="")

    print()
