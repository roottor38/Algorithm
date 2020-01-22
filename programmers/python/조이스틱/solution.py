def solution2(name):
    answer = 0
    arr = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T' 'U', 'V', 'W', 'X', 'Y', 'Z']
    rarr = ['A', 'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B']
    buff1 = 0
    buff2 = 0

    
    for v in name:
        for ii, vv in enumerate(arr):
            if v == vv:
                buff1 = buff1 + ii

        for ii, vv in enumerate(rarr):
            if v == vv:
                buff2 = buff2 + ii
        if buff1 < buff2:
            answer = answer + buff1
        else:
            answer = answer + buff2
        
        buff1 = 0
        buff2 = 0

    

    return answer

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