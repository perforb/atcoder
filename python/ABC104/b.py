import re


def check(s):
    if s[0] != "A":
        return "WA"
    if s[2:-1].count("C") != 1:
        return "WA"
    if not re.sub(r"A|C", "", s).islower():
        return "WA"
    return "AC"


s = input()
print(check(s))
