score=int(input())

if (score%4==0 and score%100!=0) or score%400==0:
    print("1")
else:
    print("0")