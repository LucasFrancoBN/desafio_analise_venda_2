package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre o caminho do arquivo: ");
    String path = sc.nextLine();

    Map<String, Double> totalSalesPerSeller = new HashMap<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      br.lines().forEach(line -> {
        String[] splitLine = line.split(",");
        if (totalSalesPerSeller.containsKey(splitLine[2])) {
          Double totalValue = totalSalesPerSeller.get(splitLine[2]);
          totalSalesPerSeller.put(splitLine[2], totalValue + Double.parseDouble(splitLine[4]));
        } else {
          totalSalesPerSeller.put(splitLine[2], Double.parseDouble(splitLine[4]));
        }
      });

      System.out.println();
      System.out.println("Total de vendas por vendedor: ");
      for (String key: totalSalesPerSeller.keySet()) {
      System.out.println(key + " - R$ " + String.format("%.2f", totalSalesPerSeller.get(key)));
      }

    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }

  }
}
