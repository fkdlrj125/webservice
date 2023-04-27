# 네이버 증권 페이지에서 국내 증시 탭의 테이블을 stock.csv 파일에 저장하시오.
# 모드 : 추가 쓰기

import pandas as pd
import os

url = 'https://finance.naver.com/sise/lastsearch2.naver'
table = pd.read_html(url, encoding='cp949')[1]
# table = pd.read_html(url, attrs={'class':'type_5'}, encoding='cp949')
file_path = os.path.join(os.path.dirname(__file__), 'stock.csv')

# with open(file_path, 'a', encoding='UTF-8') as file:
    # for data in table:
    #     file.write(str(data.dropna().set_index('순위')))
    #     # dropna() : 값이 포함되지 않은(결측치) row 삭제
    #     # set_index() : column을 인덱스로 지정
    #     # print(str(data.dropna().set_index('순위')))
    # file.write('\n')

table.dropna().to_csv(file_path, index=False, header=False, mode='a')

print('** stock.csv 저장완료 **')