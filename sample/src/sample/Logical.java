package sample;

public class Logical {

    public static void main(String[] args) {
        int score = 59 ;
        
        System.out.println("socreが40以上かつ50以下");
        System.out.println(score >= 40 && score <= 50);
        
        
        System.out.println("socreが40以上または50以下");
        System.out.println(score >= 40 || score<= 50);
        
        System.out.println("scoreが60以上ではない");
        System.out.println(!(score >= 60));
    }

}
