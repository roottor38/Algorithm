def solution(num):
    answer = 0
    if num == 1:
        return 0
    while answer < 500:
        print(answer)
        if num%2 == 0:
            num = num/2
            answer += 1
        else:
            num = num * 3 + 1
            answer += 1
        if num == 1:
            return answer


    return -1

print(solution(1))