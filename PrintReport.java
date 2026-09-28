   public class PrintReport extends ConsolesSales {
        public PrintReport(SalesModel model) {
            super(model);
        }

        public void Print() {
            System.out.println("************************************************");
            System.out.println(" CONSOLE SALES REPORT");
            System.out.println("*************************************************");
            System.out.println(" ConsoleType :" + getConsoleType());
            System.out.println(" Store:" + getStore());
            System.out.println(" TotalSales:" + getTotalSales());
            System.out.println("******************************************");
        }
}
