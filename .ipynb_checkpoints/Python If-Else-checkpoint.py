def main():
    n=int(input());
    if(n%2==1):
        print("Weird")
    else:
        if(n in range(2,5)):
            print("Not Weird")
        elif(n in range(6,21)):
            print("Weird")
        else:
            print("Not Weird")
if __name__=="__main__":
    main()