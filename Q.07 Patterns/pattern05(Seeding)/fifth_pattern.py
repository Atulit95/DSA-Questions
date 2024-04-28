def seeding(n: int):
    # Write your solution here.
    for i in range(n, 0, -1):
        for j in range(i, 0, -1):
            print("* ", end="")
        print("\n", end="")


print(seeding(5))
