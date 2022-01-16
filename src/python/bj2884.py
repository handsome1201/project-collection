hour,minute = map(int,input().split( ))

if minute<45 and hour!=0:
    minute=minute+60-45
    hour-=1
    print(hour,minute)
elif minute<45 and hour==0:
    minute = minute + 60 - 45
    hour =23
    print(hour, minute)
elif minute > 45 and hour == 0:
    minute = minute- 45
    print(hour, minute)
else:
    minute-=45;
    print(hour,minute)

