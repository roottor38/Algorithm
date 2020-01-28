def solution(d, budget):
    answer = 0
    tmp = 0
    d.sort()
    
    for i in d:
        tmp += i
        if tmp > budget:
            return answer
        answer += 1


    return answer

print(solution([1,3,2,5,4], 9))