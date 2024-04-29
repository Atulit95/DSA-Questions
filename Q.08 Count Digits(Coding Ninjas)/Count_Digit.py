def countDigits(n: int) -> int:
    duplicate = n
    count = 0
    while duplicate > 0:
        divisor = duplicate % 10
        if divisor != 0:
            # this line returns True as result which in python is treated as 1 so count is incremented by 1.
            count += (n % divisor) == 0
        duplicate //= 10
    return count


n = int(input())
print(countDigits(n))
