import sys

input = sys.stdin.readline

n = int(input())

number_list = list(map(int, input().split()))

operator_list = list(map(int, input().split()))

maxnum= -1e9
minnum= 1e9

def dfs(depth,total,plus,minus,multiply,divide):
    global maxnum,minnum
    if depth == n:
        maxnum=max(total,maxnum)
        minnum=min(total,minnum)
        return

    if plus:
        dfs(depth + 1, total + number_list[depth], plus - 1, minus, multiply, divide)
    if minus:
        dfs(depth + 1, total - number_list[depth], plus, minus - 1, multiply, divide)
    if multiply:
        dfs(depth + 1, total * number_list[depth], plus, minus , multiply - 1, divide)
    if divide:
        dfs(depth + 1, int(total / number_list[depth]), plus, minus , multiply, divide - 1)


dfs(1,number_list[0],operator_list[0],operator_list[1],operator_list[2],operator_list[3])
print(maxnum)
print(minnum)