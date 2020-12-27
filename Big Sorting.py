from collections import defaultdict

n = int(input())
bucket = defaultdict(list)

for _ in range(n):
    number = input()
    bucket[len(number)].append(number)
    
for key in sorted(bucket):
    for value in sorted(bucket[key]):
        print(value)
