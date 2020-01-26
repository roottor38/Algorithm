def solution(phone_number):
    answer = ''
    phone_number = phone_number
    length = len(phone_number)
    tmp = ""

    for i in range(length):
        if length - i == 4:
            tmp += phone_number[i:]
            return tmp
        else:
            tmp += "*"
    return answer

print(solution("01033334444"))
