package sample;

public class Switchsample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        var score =72;
        switch(score/10) {
        
        case 10 -> System.out.println("mannten");
        
        case 9,8 -> System.out.println("yokudekita");
        
        case 7,6 -> System.out.println("goukaku");
        
        default -> System.out.println("akatenn");
        
        }
    }

}
