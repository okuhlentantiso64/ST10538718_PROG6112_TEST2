public  abstract class ConsolesSales implements IConsoleinterface {
    String ConsoleType;
    String Store;
    int TotalSales;

    public ConsolesSales ( SalesModel model){
        this.ConsoleType= model.ConsoleType;
        this.Store= model.Store;
        this.TotalSales= model.TotalSales;
    }

    @Override
    public String getConsoleType() { return ConsoleType;}

    @Override
    public String getStore() { return Store;}

    @Override
    public int getTotalSales() { return TotalSales;}

}
