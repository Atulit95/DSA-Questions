class Solution(object):
    def isPalindrome(self, x):
        duplicate=x
        rev=0
        if x<0:
            return False
        while(duplicate!=0):
            rev=rev*10+(duplicate%10)
            duplicate//=10
        if rev==x:
            return True
        else:
            return False
        
solution=Solution()
n=int(input())
print(solution.isPalindrome(n))