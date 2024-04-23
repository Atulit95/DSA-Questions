from math import *
from collections import *
from sys import *
from os import *

## Read input as specified in the question.
## Print output as specified in the question.

element_index = int(input())
first_element = 1
second_element = 1
temp_third_element = 0

if element_index == 1 or element_index == 2:
    print(1)
else:
    for _ in range(1, element_index - 1):
        temp_third_element = first_element + second_element
        first_element = second_element
        second_element = temp_third_element
    print(temp_third_element)
