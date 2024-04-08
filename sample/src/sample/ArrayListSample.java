package sample;

import java.util.ArrayList;
import java.util.List;


public class ArrayListSample {

    public static void main(String[] args) {
        
        List<String> places = new ArrayList<>();
        
        places.add("island");
        places.add("spain");
        places.add("napori");
        places.add("japan");
        places.add("ropponngi");
        
        // 
        String firstItem = places.get(0);
        System.out.println("1番目の要素、置換前："+firstItem);
        
        places.set(0,"korea");
        System.out.println("1番目の要素、置換後："+places.get(0));
        
        System.out.println("2番目の要素、削除前"+places.get(1));
        places.remove(1);
        System.out.println("2番目の要素、削除後"+places.get(1));
        
        System.out.println("拡張forループによる取得");
        for(String place : places) {
            System.out.println(place);
        }
        
        System.out.println("forEachとラムダ式による取得");
        places.forEach((place) -> System.out.println(place));
        
        int size =places.size();
        System.out.println("リストサイズの変更、クリア前"+size);
        places.clear();
        System.out.println("リストサイズの変更、クリア後"+places.size());
    }
    
    
    

}
