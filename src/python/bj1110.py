x=int(input())

result=x;
count=0;
while True:
    ten = x // 10
    one = x % 10
    add = (ten + one) % 10
    x = 10 * one + add
    count=count+1
    if(result==x):
        break

print(count)