package classExam;

public class MarketGoods {
    final String name; //상품명
    final int retailPrice; //출시가
    private int discountRate; //할인율


    // 생성자
    public MarketGoods(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;

        if(discountRate < 0 || discountRate > 100){
            this.discountRate = 0;
        }
        else{
            this.discountRate = discountRate;
        }
    }

    public MarketGoods(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
    }


    // getter & setter
    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        if(discountRate < 0 || discountRate > 100){
            this.discountRate = 0;
        }
        else{
            this.discountRate = discountRate;
        }
    }


    // methods
    public int getDiscountPrice(){
        return  retailPrice - retailPrice * discountRate/100;
    }


}
