def solution(s):
    length = len(s)
    def compress(size):
        ret = 0
        before =  s[:size]
        count = 1
        for i in range(size, length, size):
            word = s[i:i+size]
            if word == before:
                count += 1
            else:
                if count > 1:
                    ret += len(str(count))
                ret += size
                before, count = word, 1
        if count > 1:
            ret += len(str(count))
        ret += len(before)
        return ret

    ans = length
    for size in range(1, ans+2//2):
        ans = min(ans, compress(size))
    return ans

s = "abcabc"     
print(solution(s))

