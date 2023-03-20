n = int(input())
a = list(map(int, input().split()))
counter = 0

while True:
    a = [i // 2 for i in a if i % 2 == 0]
    if len(a) == n:
        counter += 1
    else:
        break

print(counter)
