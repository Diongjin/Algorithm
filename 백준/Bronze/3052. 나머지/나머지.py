no = []

for i in range(10):
    a = int(input())
    if a%42 not in no:
        no.append(a%42)

print(len(no))