if __name__ == '__main__':
    n = int(input())
    arr = list(map(int,input().split()))
    large=-9999
    for i in range(0,n):
        if arr[i]>large:
            large=arr[i]
    seclarge=-9999
    for i in range(0,n):
        if arr[i]>seclarge and arr[i]!=large:
            seclarge=arr[i]
    print(seclarge)