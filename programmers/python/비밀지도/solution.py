def solution(n, arr1, arr2):
    answer = []
    tmp = ""

    for i, v in enumerate(arr1):
        arr1[i] = format(v, 'b').zfill(n)
    for i ,v in enumerate(arr2):
        arr2[i] = format(v, 'b').zfill(n)
        
    for a1, a2 in zip(arr1, arr2):
        #print(a1, ", ", a2)
        for i in range(n):
            if a1[i] == '0' and a2[i] == '0':
                tmp += ' '
            else:
                tmp += "#"

        answer.append(tmp)
        tmp = ""




    return answer

print(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]))