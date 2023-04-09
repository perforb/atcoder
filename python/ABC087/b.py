a = int(input())
b = int(input())
c = int(input())
d = int(input())
answer = 0

for aa in range(0, a + 1):
    for bb in range(0, b + 1):
        for cc in range(0, c + 1):
            if aa * 500 + bb * 100 + cc * 50 == d:
                answer += 1


print(answer)
