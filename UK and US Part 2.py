# Enter your code here. Read input from STDIN. Print output to STDOUT

import re

tx = ' '
erg = []
for n in range(int(input())):
    tx =tx+" "+input()
tx=tx+" "
for n in range(int(input())):
    e = input()
    #print(e[:e.index('u')]+"(u)?"+e[e.index('r',e.index('u')):])
    #print(e[:e.index('our')]+"o(u)?"+e[e.index('r',e.index('our')):])
    res=re.findall(e[:e.index('our')]+"o(u)?"+e[e.index('r',e.index('our')):]+"\s",tx)
    print(len(res))
