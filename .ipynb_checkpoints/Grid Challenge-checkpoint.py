n_test_cases =  int(input())
for test in range(n_test_cases):
    n_rows = int(input())
    matrix = []
    for row in range(n_rows):
        new_row = input()
        sorted_row = sorted(new_row)
        matrix.append(sorted_row)
    possible = "YES"
    columns = [list(column) for column in zip(*matrix)]
    for column in columns:
        if column != sorted(column):
            possible = "NO"
            break
    print(possible)