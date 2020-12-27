def quicksort(ar):
    if len(ar) < 2:
        return ar
    lt, eq, rt = [], [], []
    for item in ar:
        if item < ar[0]:
            lt.append(item)
        elif item > ar[0]:
            rt.append(item)
        else:
            eq.append(item)
    sub = quicksort(lt) + eq + quicksort(rt)
    print(' '.join([str(x) for x in sub]))
    return(sub)

n = input().strip().split()
ar = [int(x) for x in input().strip().split()]
quicksort(ar)

