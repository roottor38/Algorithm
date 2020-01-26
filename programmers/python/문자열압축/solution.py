# 문자열 규칙
# 1. 1이상의 단위로 압축할 수 있다.
# 2. 맨 처음 문자열이 같은 경우에만 압축할 수 있다.(ex : xabcabc는 압축 할 수 없다.)
# 3. 압축이 안된 문자열은 그대로 붙여 준다.
# 4. 문자열 패턴은 문자열 길이가 1/2 이상이 될 수 없다.
# 5. 압축 진행 후 문자열 길이를 리턴한다.

def solution(s): 
    length = len(s) 
    answer = 0
    tmp = ""
    count = 0
    result = ""

    for i in range(1, length//2 + 1):
        




    


print(solution("aaaa"))#7