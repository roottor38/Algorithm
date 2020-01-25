def solution(s): 
    length = len(s) 
    answer = 9999999 # 문자열의 길이가 1인 경우 그 문자열 그대로 반환되므로 답은 1이 됩니다. 
    if length == 1: 
        answer = 1 
    else: 
        for i in range(1, length // 2 + 1): 
            tmp = s ''' 문자열 split하기 문자열을 1개부터 length//2개까지 split을 합니다. 잘린 문자열은 spl에 저장됩니다. ''' 
            begin = 0; 
            end = begin + i 
            spl = [] 
            while tmp: 
                spl.append(tmp[begin:end]) 
                tmp = tmp[end:] ''' 잘린 문자열들을 순회합니다. 앞의 문자열과 같으면 카운팅을 해주고 다르면 카운팅+앞의문자열을 출력해줍니다. ''' 
                newstr = "" 
                before = spl[0] cnt = 1 
                for idx, c in enumerate(spl): 
                    spl_length = len(spl) 
                    if idx: 
                        if c == before: 
                            cnt += 1 
                            if idx == spl_length - 1: 
                                newstr += (str(cnt) + before) 
                            else: if cnt > 1: newstr += (str(cnt) + before) 
                            if idx == (spl_length - 1): 
                                newstr += c
                            else: newstr += before 
                            if idx == (spl_length - 1): 
                                newstr += c 
                                cnt = 1 
                                before = c # 새로 생긴 문자열이 최소값일 경우 answer를 갱신해줍니다. 
                                new_str_length = len(newstr) 
                                if new_str_length < answer: 
                                    answer = new_str_length 
                                return answer s = "aaaaa" print(solution(s))


solution("sss")