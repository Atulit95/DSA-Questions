def nForest(n: int) -> None:
    # Write your solution here.
    for i in range(0, n + 1):
        for j in range(0, i):
            print("* ", end="")
        print("\n", end="")


print(nForest(5))
