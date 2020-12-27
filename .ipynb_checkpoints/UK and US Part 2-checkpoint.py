import re

tx = ' '
erg = []
for n in range(int(input())):
    tx =tx+" "+input()
tx=tx+" "
for n in range(int(input())):
    e = input()
    res=re.findall(e[:e.index('our')]+"o(u)?"+e[e.index('r',e.index('our')):]+"\s",tx)
    print(len(res))