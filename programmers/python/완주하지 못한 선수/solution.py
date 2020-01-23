import collections


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
    


solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"])