package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
  public static void main(String[] args) {
    System.out.println(getDbConnectionURL());
    System.out.println(getDbConnectionUrlSupplier.get());
  }

  static String getDbConnectionURL(){
      return "jdbc:localhost:8443/supplier";
  }

  static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc:localhost:8443/supplier";

}
