public class Main {

    public static void main(String[] args) {
        // The below is a pull style observer pattern where
        // each observer uses the data source/publisher class
        // as a dependency and takes whatever it wants in the update method
        // from the publisher itself.


        // Another style is the push-style where the publisher
        // pushes the data to the observer/s. This is more tightly-coupled,
        // and we will need to be pass in the exact type. In the future, it will be
        // hard to extend and make a lot of changes to various files when the type changes


        // Instantiate the datasource/publisher class.
        var stock = new Stock();

        // Instantiate the subscriber/observer classes.
        var stockList = new StockList(stock);
        var stockStatusBar = new StockStatusBar(stock);

        // Add the observer/s to the data source.
        stock.addObserver(stockList);
        stock.addObserver(stockStatusBar);

        stock.setStockPrice(8);

    }
}
