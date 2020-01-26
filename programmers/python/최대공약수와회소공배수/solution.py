# def solution(n, m):
#     answer = []

#     for i in range(n, 0, -1):
#         if m%i == 0 and n%i == 0:
#             answer.append(i)
#             break
    
#     a= (n*m)//answer[0]
#     answer.append(a)
    
#     return answer

def solution(n, m):
    answer = []
    test = []
    for i in range(n, 0, -1):
        if m%i == 0 and n%i == 0:
            answer.append(i)
            break
    
    for i in range(1 , m+1):
        test.append(i*n)
    
    for i in test:
        if i%m == 0:
            answer.append(i)
            break

    print(test)
    return answer

print(solution(18, 12))