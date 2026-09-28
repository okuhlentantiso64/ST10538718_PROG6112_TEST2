//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    SalesModel model = new SalesModel();
    model.ConsoleType = " PS5";
    model.Store = "Number 1 Electronics Store";
    model.TotalSales = 500;

    // Prompts user for inputs matching the specimen output

    Scanner scanner = new Scanner(System.in);{

        System.out.print("Enter the ConsoleType: ");
          int ConsoleType = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Enter the Store: ");
        String Store = scanner.nextLine();

        System.out.print("Enter the TotalSales: ");
        String TotalSales = scanner.nextLine();
    }


    PrintReport printReport = new PrintReport(model);
    printReport.Print();
}



