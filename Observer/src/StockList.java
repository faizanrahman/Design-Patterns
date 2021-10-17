public class StockList implements Observer {
    private Stock stockDataSource;

    public StockList(Stock stockDataSource) {
        this.stockDataSource = stockDataSource;
    }

    @Override
    public void update() {
        System.out.println("Stock List got updated: " + stockDataSource.getStockPrice());
    }
}
