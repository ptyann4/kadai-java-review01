
public class Review01 {

    public static void main(String[] args) {
        int productPrice = 1500;
        int consumptionTaxRate = 10;
        System.out.printf("%s円の商品の税込価格は%s円（消費税は%s円）です。", productPrice,
                productPrice + tax(productPrice, consumptionTaxRate), tax(productPrice, consumptionTaxRate));

    }

    private static int tax(int productPrice, int consumptionTaxRate) {
        return productPrice / consumptionTaxRate;
    }

}
