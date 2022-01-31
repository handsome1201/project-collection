N, M = map(int, input().split())
original = []
count = []

for _ in range(N):
    original.append(input())

for a in range(N-7):
    for b in range(M-7):
        indexW=0
        indexB=0
        for c in range(a,a+8):
            for d in range(b,b+8):
                if (c+d)%2==0:
                    if original[c][d]!='W':
                        indexW+=1
                    if original[c][d]!='B':
                        indexB+=1
                else:
                    if original[c][d]!='W':
                        indexB+=1
                    if original[c][d]!='B':
                        indexW+=1
        count.append(min(indexW,indexB))
print(min(count))