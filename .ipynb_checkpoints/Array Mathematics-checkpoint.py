import numpy as np
N, M = list(map(int, input().split()))

a1 = np.array([input().split() for _ in range(N)], int)
a2 = np.array([input().split() for _ in range(N)], int)

print(*[eval('a1'+i+'a2') for i in ['+','-','*','//','%','**']], sep='\n')