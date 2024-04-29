def reverse(x: int) -> int:
    duplicate_x = x
    if x < 0:
        x *= -1

    res = 0
    while x > 0:
        res = (res * 10) + (x % 10)
        x //= 10

    if res > 2**31 - 1 or res < -(2**31):
        return 0

    return res * -1 if duplicate_x < 0 else res


n = int(input())
print(reverse(n))
