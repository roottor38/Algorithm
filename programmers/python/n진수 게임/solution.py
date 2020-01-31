def solution(n, t, m, p):
    answer = ''
    tmp = ""
    index = 0
    # if n == 2:
    #     while len(tmp) < t*m:
    #         tmp = tmp + format(index, 'b')
    #         index = index + 1
    # elif n == 16:
    #     while len(tmp) < t*m:
    #         tmp = tmp + format(index, 'x').upper()
    #         index = index + 1
    
    def conv(number,base):
        T="0123456789ABCDEF"
        i,j=divmod(number,base)
        
        if i==0:
            return T[j]
        else:
            return conv(i,base)+T[j]

    while len(tmp) < t*m:
        tmp = tmp + conv(index, n)
        index = index + 1
    for i in range(p-1, len(tmp), m):
        answer += tmp[i]
        if len(answer) == t:
            return answer

    return answer

print(solution(2, 4, 2, 1))