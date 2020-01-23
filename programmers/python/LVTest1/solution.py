# def solution(n):
#     answer = []
#     strn = str(n)
#     strn = list(strn)

#     for i in reversed(strn):
#         answer.append(int(i))
#     return answer


def solution(arr):
    if len(arr) <= 1:
        return [-1]
    else:
        arr.remove(min(arr))
        return arr
solution([4,2,1,3])