n = int(input())

for i in range(n):
    test_list = list(map(int, input().split()))
    m=test_list[0]
    s=sum(test_list[1:])/m
    over=0
    count=0

    for i in test_list[1:]:
        if i>s:
            count+=1
    t=((count/test_list[0])*100)
    print('%.3f' %t + '%')
