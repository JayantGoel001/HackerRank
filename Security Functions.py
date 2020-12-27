#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the calculate function below.
def calculate(x):
    return x%11
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    x = int(input())

    result = calculate(x)

    fptr.write(str(result) + '\n')

    fptr.close()
