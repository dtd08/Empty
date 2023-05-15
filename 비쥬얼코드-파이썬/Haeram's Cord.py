import sys
#-----------------------------
print("아무것도 모타조의 모범자판기입니다.")
print("메뉴를 출력해드리겠습니다.")
print("!주의사항! 잘못된 값을 입력시 자판기는 곧바로 종료됩니다.")
menu1={"코카콜라":1500,"코카콜라 제로":1500,"펩시콜라":1700,"펩시콜라 제로":1700,"울트라수퍼두퍼솔의눈":20000,"지코":500,"맥콜":1500,"스프라이트":2000}
print(menu1)
print("-----------------------------")
price = 0
주문안내 = "을/를 몇 개 주문하시겠습니까? 주문하지 않으시겠다면 0개를 선택해주세요. "
가격합계 = "현재 주문하신 이 음료수의 가격 합계는 {}원입니다."
#-----------------------------
def price_calculation(drink_kind):
  global drink_lastprice
  drink_count = int(input(drink_kind + 주문안내))
  if(drink_count >= 1):
    drink_lastprice = drink_count * menu1.get(drink_kind)
    print(가격합계.format(drink_lastprice))
    return drink_lastprice
  else:
    print("선택하신 음료수의 주문이 끝났습니다.")
#-----------------------------
def order_drink(order_count):
 for i in range(order_count):
  order = input("-----------------------------\n희망하시는 사항이 있으시다면 안내에 따른 숫자를 입력해주세요. ")
  if order == "1":
   price += order_drink("코카콜라")
  elif order == "2":
   price += order_drink("코카콜라 제로")
  elif order == "3":
   price += order_drink("펩시콜라")
  elif order == "4":
   price += order_drink("펩시콜라 제로")
  elif order == "5":
   price += order_drink("울트라수퍼두퍼솔의눈")
  elif order == "6":
   price += order_drink("지코")
  elif order == "7":
   price += order_drink("맥콜")
  elif order == "8":
   price += order_drink("스프라이트")
  elif order == "0":
   print("-----------------------------")
   print("음료수를 주문하지 않으셨습니다.")
  else:
   sys.exit("자판기의 사용을 종료합니다.")
 return price
#-----------------------------
count = int(input("음료수를 몇 종류 주문하시겠습니까? : "))
print("-----------------------------\n주문하고 싶으시다면, 아래 안내를 따라주세요.\n코카콜라 주문 : 1\n코카콜라 제로 주문 : 2\n펩시콜라 주문 : 3\n펩시콜라 제로 주문 :4\n울트라수퍼두퍼솔의눈 주문 : 5\n지코 주문 : 6\n맥콜 주문 수정 : 7\n스프라이트 주문 : 8\n해당사항 없음 : 이외 값")
price = order_drink(count)
print("-----------------------------\n주문을 수정하고 싶으시다면, 아래 안내를 따라주세요.\n코카콜라 주문 수정 : 1\n코카콜라 제로 주문 수정 : 2\n펩시콜라 주문 수정 : 3\n펩시콜라 제로 주문 수정 :4\n울트라수퍼두퍼솔의눈 주문 수정 : 5\n지코 주문 수정 : 6\n맥콜 주문 수정 : 7\n스프라이트 주문 수정 : 8\n해당사항 없음")
count_retouch=int(input("-----------------------------\n몇 종류의 음료수 주문내역을 수정/추가하시겠습니까? : "))
price = order_drink(count_retouch)
#-----------------------------
if count==0 and count_retouch==0:
  print("아무런 음료수도 주문하지 않으셨습니다. 자판기의 사용을 종료합니다.")
  sys.exit("자판기의 사용을 종료합니다.")

print("-----------------------------")
print("주문하신 항목들의 가격 합계는 {}입니다!".format(price))
print("-----------------------------")

payment = int(input("지불하실 금액을 입력해주세요."))
if payment <= 0 or payment < price:
  print("가격에 맞는 돈을 지불하지 않으시면 계산할 수 없습니다.")
  sys.exit("돈을 지불하지 않으셨으므로, 자판기의 사용을 종료합니다.")

change = payment - price
coin = [1000, 500, 100, 50, 10]

print("-----------------------------")
print("거스름돈을 출력합니다!")
for i in range(0, len(coin)):
  print(coin[i], "원 짜리", (change // coin[i]),"개")
  change %= coin[i]

print("-----------------------------")
print("아무것도 모타조의 모범자판기를 이용해주셔서 감사합니다!")
print("-----------------------------")