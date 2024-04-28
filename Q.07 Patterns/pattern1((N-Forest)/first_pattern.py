def nForest(n: int) -> None:
    # Write your solution here.
    for i in range(n, 0, -1):
        for j in range(0, n):
            print("* ", end="")
        print()


print(nForest(5))
