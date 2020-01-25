import collections

# def solution(participant, completion):
#     answer = ''

#     for pv in participant:
#         for cv in completion:
#             if pv == cv:
#                 participant.remove(cv)

#     participant[0] = answer
#     print(answer)
#     return answer

def solution(participant, completion):
    answer = ''
    temp = 0
    dic = {}

    for p in participant:
        dic[hash(p)] = p
        temp += int(hash(p))
    for c in completion:
        temp -= hash(c)
    answer = dic[temp]
    return answer
    