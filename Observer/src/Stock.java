// Can also be called 'StockDataSource'
// this class is the publisher. Each observer is a subscriber.
public class Stock extends StockPriceObservable {
    private int stockPrice;

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
