package sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
      try {
        System.out.println("shorikaisi");
        int a = 10/0;
        System.out.println(a);
      }catch (ArithmeticException e) {
          
          System.out.println("arithmetiExceptionhassei"+ e.getMessage());
      }finally {
        System.out.println("warizannshuuryou");
    }
        // TODO: handle exception
      System.out.println("shorishuuryou");
    }
        //oboerarenaiyo
    }

