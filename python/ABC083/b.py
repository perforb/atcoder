n, a, b = map(int, input().split())
numbers = []

for i in range(1, n + 1):
    c = sum(map(int, list(str(i))))
    if a <= c <= b:
        numbers.append(i)

print(sum(numbers))
