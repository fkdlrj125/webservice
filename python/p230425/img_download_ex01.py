import urllib.request as request
import os

img_url = 'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzAzMjhfMjk4%2FMDAxNjc5OTgwMzE5MjY0.vcnnquHAcxXvysGRn96Lxr37RDPb8XbrO6NMq5F36Ggg.jtlM4_J4S_CvvorPLjLEabS7LNwLJtODmiKBdZNr8pEg.PNG.firstcatsw%2F2%25BD%25C7%25B9%25D9.png&type=sc960_832'
file_path = os.path.join(os.path.dirname(__file__), 'cat.png')

# 1. 이미지 요청 
request_img = request.urlopen(img_url).read()
# print(request_img)

# 2. open 함수
# 이미지 파일이 바이너리 파일이기 때문에 바이너리로 이미지 생성
img = open(file_path, 'wb')

# 3. write 함수
img.write(request_img)

# 4. close 함수
img.close()

print('** 이미지 다운로드 완료 **')