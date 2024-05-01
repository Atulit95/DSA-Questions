from math import *
from collections import *
from sys import *
from os import *

## Read input as specified in the question.
## Print output as specified in the question.
n=int(input())
count=0
for i in range(2,int(sqrt(n))+1):
    if(n%i==0):
        count+=1
if(count>0 or n==1):
    print("NO")
else:
    print("YES")