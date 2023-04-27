# # [방법 1]
# from urllib import request
# # [방법 2]
# from urllib.request import urlretrieve
# [방법 3]
import urllib.request

import os

img_url = 'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzAzMzBfNDIg%2FMDAxNjgwMTY3Mzg5NTU4.syK6HXmR2TLG4bYwXi9TZhSfDmj3sgwX6KLnJrPAANkg.rlhxtUON-ugwdkVECuJ5loidrivaRkJHMLBW6MVK2P4g.JPEG.ckdgml890118%2F5_%252810%2529.jpg&type=sc960_832'
file_path = os.path.join(os.path.dirname(__file__), 'cat4.png')

# # [방법 1]
# request.urlretrieve(img_url, file_path)

# # [방법 2]
# urlretrieve(img_url, file_path)

# [방법 3]
urllib.request.urlretrieve(img_url, file_path)

print('** 이미지 다운로드 완료 **')