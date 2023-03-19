def sum_digits(n):
    r = 0
    while n > 0:
        r += n % 10
        n //= 10
    return r


n, a, b = map(int, input().split())
answer = 0

for i in range(1, n + 1):
    if a <= sum_digits(i) <= b:
        answer += i

print(answer)
