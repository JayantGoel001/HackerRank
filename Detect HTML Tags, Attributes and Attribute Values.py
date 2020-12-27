# Enter your code here. Read input from STDIN. Print output to STDOUT
from html.parser import HTMLParser
class HTMLParser(HTMLParser):
    def handle_starttag(self,data,attr):
        print(data)
        if(len(attr)!=0):
            for i in attr:
                print("->",i[0],">",i[1])
n=int(input())
string=""
for i in range(n):
    string+=input()
parser=HTMLParser()
parser.feed(string)

