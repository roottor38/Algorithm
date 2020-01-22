def solution(people, limit):
    buff=[]
    a=0

    while(True):
        p=people.pop()
        for i in range(0,len(people)-1):
            if p+people[i]<=limit:
                buff.append(p+people[i])
        if len(buff)!=0:
            a += 1
            people.remove(max(buff)-p)
            buff=[]
        else:
            a+=1
        if len(people)<=1:
            break
    
    return a+1


print(solution([70, 50, 80, 50], 100))
