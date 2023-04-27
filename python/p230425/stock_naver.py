import pandas

url = 'https://finance.naver.com/'

table = pandas.read_html(url, encoding='euc-kr')
# print(table)
# print(type(table))
# print(len(table))
# print(table[0])
# print(table[1])
print(type(table[0]))