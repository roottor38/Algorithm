def solution(x, n):
    answer = []

    if x == 0:
        return [0]

    if x > 0 :
        for i in range(x, x*n + 1, x):
            answer.append(i)
    else:
        for i in range(x, x*n-1, x):
            answer.append(i)



    return answer

print(solution(2, 2))
