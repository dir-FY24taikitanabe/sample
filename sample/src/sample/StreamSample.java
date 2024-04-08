package sample;
import java.awt.image.CropImageFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.crypto.dsig.spec.XPathType.Filter;


public class StreamSample {

    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        
        
        places.add("island");
        places.add("spain");
        places.add("napori");
        places.add("korea");
        places.add("chaina");
        
        
        System.out.println("streamforEachによる取得:");
        places.stream().forEach(place -> System.out.println(place));
        
        System.out.println("　「a」で終わる場所のみ検出:");
           places.stream()
            .filter(place -> place.endsWith("a"))
            .forEach(place -> System.out.println(place));
        
        System.out.println(" 各場所名の長さを表示:");
            places.stream()
                .map(place -> place+"の長さ"+place.length())
                .forEach(place -> System.out.println(place));
            
            
        System.out.println("　ソート:");
        places.stream()
              .sorted()
              .forEach(place -> System.out.println(place));
        
        List<String>filteredplaces = places.stream()
                .filter(place -> place.contains("n"))
                .collect(Collectors.toList());
        System.out.println("「n」を含む場所:"+filteredplaces);

    }

}
