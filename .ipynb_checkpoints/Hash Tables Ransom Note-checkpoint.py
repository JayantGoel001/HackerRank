n,m = map(int,input().split())
mag = list(input().split())
note = list(input().split())

if n>=m:
    dic_mag = {}
    dic_note = {}

    for i in mag:
        if i in dic_mag:
            dic_mag[i] += 1
        else:
            dic_mag[i] = 1

    for i in note:
        if i in dic_note:
            dic_note[i] += 1
        else:
            dic_note[i] = 1
    
    for i in note:
        if i in dic_mag and dic_note[i]<=dic_mag[i]:
            pass
        else:
            print("No")
            break
    else:
        print("Yes")
else:
    print("No")