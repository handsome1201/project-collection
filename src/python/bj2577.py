a=[]
for i in range(10):
    a.append(int(input()))

result=1

result=list(str(result*a[0]*a[2]*a[1]))

for i in range(10):
    print(result.count(str(i)))