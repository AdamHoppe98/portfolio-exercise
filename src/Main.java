import market.Symbol;
import menu.Menu;
import portfolio.Portfolio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Opret en Scanner instance
        Scanner scanner = new Scanner(System.in);
        // TODO: Opret en Portfolio instance

        Portfolio pf = new Portfolio(20000);
        // TODO: Show menu
        Menu.showMenu(pf, scanner);

        // TODO: Luk scanneren
        scanner.close();
    }
}
