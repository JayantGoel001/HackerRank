def print_rangoli(size):
    for i in range(0,size):
        for j in range(0,2*(size-i)-2):
            print("-",end="")
        for j in range(0,i):
            print(chr(96+size-j),end="")
            print("-",end="")
        print(chr(96+size-i),end="")
        for j in range(i-1,-1,-1):
            print("-",end="")
            print(chr(96+size-j),end="")
        for j in range(0,2*(size-i)-2):
            print("-",end="")
        print()
    for i in range(size-2,-1,-1):
        for j in range(0,2*(size-i)-2):
            print("-",end="")
        for j in range(0,i):
            print(chr(96+size-j),end="")
            print("-",end="")
        print(chr(96+size-i),end="")
        for j in range(i-1,-1,-1):
            print("-",end="")
            print(chr(96+size-j),end="")
        for j in range(0,2*(size-i)-2):
            print("-",end="")
        print()

