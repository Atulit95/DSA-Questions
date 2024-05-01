def calcGCD(n:int, m: int) -> int:
    # Write your code here
    if m > n:
        n, m = m, n

    # Base case of gcd(n, 0) = n.
    if (m == 0):
        return n
    
    # Using Euclidean Therorem.
    return calcGDC(m, n % m)

n=int(input())
m=int(input())
print(calcGCD(n,m))