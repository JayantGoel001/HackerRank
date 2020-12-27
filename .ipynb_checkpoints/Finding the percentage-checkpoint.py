if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        sum=0.0
        for i in range(0,3):
            sum=sum+scores[i]
        avg=sum/3;
        student_marks[name] = avg
    query_name = input()
    print("%.2f"% student_marks[query_name])