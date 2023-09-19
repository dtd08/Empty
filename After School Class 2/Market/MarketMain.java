package classExam;

public class MarketMain {
    public static void main(String[] args) {

//      생성자를 통해 인스턴스 변수의 값을 초기화한다.
        MarketGoods g1 = new MarketGoods("Macbook Air", 1950000);
        MarketGoods g2 = new MarketGoods("Macbook Pro", 295000, 15);
        MarketGoods g3 = new MarketGoods("iPhone14", 920000, 20);

        g1.setDiscountRate(30);

        System.out.println("\t\t |  Goods Name  |  Retail Price  |  Discount Rate  |  Discount Price");
        System.out.printf("\tg1\t | \t%s\t | \t%d\t | \t%d%%\t | \t%d \n", g1.name, g1.retailPrice, g1.getDiscountRate(), g1.getDiscountPrice());
        System.out.printf("\tg2\t | \t%s\t | \t%d\t | \t%d%%\t | \t%d \n", g2.name, g2.retailPrice, g2.getDiscountRate(), g2.getDiscountPrice());
        System.out.printf("\tg3\t | \t%s\t | \t%d\t | \t%d%%\t | \t%d \n", g3.name, g3.retailPrice, g3.getDiscountRate(), g3.getDiscountPrice());

//      System.out.println(g1.name);
//      System.out.println(g1.retailPrice);
//      System.out.println(g1.getDiscountRate());
//      System.out.println(g1.getDiscountPrice());

    }
}
