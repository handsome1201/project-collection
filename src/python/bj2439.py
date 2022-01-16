star = '*'
empty = ' '
n = int(input())
for i in range(1, n + 1):
    print(empty*(n-i)+i * star)