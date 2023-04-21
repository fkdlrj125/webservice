list_value = ['100', 'good', '5', '250', 'hi', '500']
list_number = []

# for el in list_value:
    # [1]
    # try:
    #     if isinstance(eval(el), int):
    #         list_number.append(el)
    # except:
    #     pass

    # [2]
    # try:
    #     int(el)
    # except:
    #     pass
    # else:
    #     list_number.append(el)

try:
    for el in list_value:
        int(el)
        list_number.append(el) # 간결한 코드는 try문에 넣는 경우도 있음
except:
    pass


print('list_number >>', list_number)