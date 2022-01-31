N, M = map(int, input().split())
original = []
count = []

for i in range(N):
    original.append(input())

for a in range(N-7):
    for b in range(M-7):
        index1=0
        index2=0
        for c in range(a,a+8):
            for d in range(b,b+8):
                if (c+d)%2==0:
                    if original[c][d]!='W':
                        index1+=1
                    if original[c][d] != 'B':
                        index2 += 1
                else:
                    if original[c][d]!='W':
                        index2+=1
                    if original[c][d] != 'B':
                        index1 += 1
        count.append(min(index1,index2))
print(min(count))