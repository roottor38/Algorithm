def solution(n, lost, reserve):
    clothes_list = [1]*n          #학생들 모두 체육복을 가지고 있다
    for i in reserve:             #여분의 옷을 챙긴 학생들의index에 표시
        clothes_list[i-1] = 2

    for i in lost:                #도난 당한 학생들의 체육복을 1개씩 줄임
        clothes_list[i-1] = clothes_list[i-1]-1
    print(clothes_list)

    for index,value in enumerate(clothes_list):     #index와 value값 둘다 사용하려고 enumerate를 가져와 사용
        if index > 0 and value == 0 and clothes_list[index-1]==2:  #0이면 이전친구에게 체육복 남는거 있냐고 물어봄
            clothes_list[index] = 1                                 #이때 boundary를 벗어나는 것을 방지하기 위해 1부터로 처리
            clothes_list[index-1] =1                                #빌렸으니 0이던 학생은 1로 빌려준 학생은 2->1이 된다
        elif index < n-1 and value == 0 and clothes_list[index+1]==2:
            clothes_list[index] = 1
            clothes_list[index+1] =1

    return n-clothes_list.count(0)