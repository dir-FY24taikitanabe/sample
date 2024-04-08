package sample;

public class ArraySample {

    public static void main(String[] args) {
        var numbers = new int[5];
        
        for(var i=0; i < numbers.length; i++) {
            numbers[i] = i*2;
        }//For文は最初の枠の書き方注意
        
        for(var i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

    }

}
