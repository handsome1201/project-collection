n = int(input())
test_list = list(map(int, input().split()))


new_list = []
for score in test_list:
    new_list.append(score/max_score*100)

testaverage=sum(new_list)/n
print(testaverage)