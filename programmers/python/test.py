def conv(number,base):
    T="0123456789ABCDEF"
    i,j=divmod(number,base)
    
    if i==0:
        return T[j]
    else:
        return conv(i,base)+T[j]

#print("%d to bin => %s" % (3, conv(100,3)))

def converter(num, base):
    T="0123456789ABCDEF"
    answer = ""
    while num != 0:
        answer += T[num%base]
        num = num // base
    
    return answer

print(converter(2, 2))
