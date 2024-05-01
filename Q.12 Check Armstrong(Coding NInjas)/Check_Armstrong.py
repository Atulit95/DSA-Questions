def checkArmstrong(n):
    #write your code here !!!!!!!!!
    duplicate=n
    number_of_digit=len(str(n))
    print(number_of_digit)
    sum=0
    while(n!=0):
        sum=sum+(n%10)**number_of_digit
        n//=10

    if(sum==duplicate):
        return True
    else:
        return False
    
n=int(input())
print(checkArmstrong(n))