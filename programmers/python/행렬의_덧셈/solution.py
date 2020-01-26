def solution(arr1, arr2):
    answer = []
    tmp = []

    for i in range(len(arr1)):
        for j in range(len(arr1[i])):
            tmp.append(arr1[i][j] + arr2[i][j])
            
        answer.append(tmp)
        tmp = []


    return answer

print(solution([[1,2],[2,3]], [[3,4],[5,6]]))