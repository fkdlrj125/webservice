# [문제] 웹 페이지 요청 후 파싱하시오.
from bs4 import BeautifulSoup
# from urllib import request
import pandas
import requests


url = 'https://www.transfermarkt.com/spieler-statistik/wertvollstespieler/marktwertetop'

html = requests.get(url, headers={'User-Agent': 'Mozilla/5.0'}).text
soup = BeautifulSoup(html, 'html.parser')
print(soup)