n = int(input())

for i in range(n):
    m=input()
    s=list(m)
    score=0
    conti=1
    for i in s:
        if i == 'O':
            score += conti
            conti += 1
        else:
            conti=1
    print(score)
