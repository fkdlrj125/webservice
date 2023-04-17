# 함수 정의
def student_score(**score):
    # print(score, type(score))
    # print('요소 수 >>', len(score))
    add = sum(score.values())
    print('총점 >>', add)
    # print('평균 >> %0.1f'%(add / len(score)))
    print(f'평균 >> {(add / len(score)):.1f}')

# 함수 호출
student_score(math=90, eng=99, kor=95)
