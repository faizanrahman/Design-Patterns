public class StockStatusBar implements Observer {
    private Stock stockDataSource;

    public StockStatusBar(Stock stockDataSource) {
        this.stockDataSource = stockDataSource;
    }

    @Override
    public void update() {
        System.out.println("Status Bar got updated: " + stockDataSource.getStockPrice());
    }
}
