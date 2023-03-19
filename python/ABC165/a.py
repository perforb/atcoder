k = int(input())
a, b = map(int, input().split())
found = False

for i in range(a, b + 1):
    if i % k == 0:
        found = True
        break

print("OK" if found else "NG")
