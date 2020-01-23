def solution(name):
    answer = 0
    name = list(name)
    a = ["A"] * len(name)
    index = 0

    while(True):
        rIndex = 1 
        lIndex = 1
        if name[index] != 'A':
            if ord(name[index])-ord("A")>13:
                answer+=26-(ord(name[index])-ord("A"))
            else:
                answer+=ord(name[index])-ord("A")
            name[index] = "A"
            print(name)
        if name == a:
            break
        else:
            for ii in range(1,len(name)):
                if name[index+ii]=="A":
                    rIndex+=1
                else:
                    break
                if name[index-ii]=="A":
                    lIndex+=1
                else:
                    break
            if rIndex>lIndex:
                answer+=lIndex
                index-=lIndex
            else:
                answer+=rIndex
                index+=rIndex

    return answer

print(solution('JAN'))
#26