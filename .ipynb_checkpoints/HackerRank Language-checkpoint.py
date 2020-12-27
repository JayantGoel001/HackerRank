import re
n=int(input())
for i in range(n):
    n,st=input().split()
    res=re.search("^(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$",st)
    if(res!=None):
        print("VALID")
    else:
        print("INVALID")
