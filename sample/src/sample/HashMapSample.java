package sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {
        Map<String, String>members =new HashMap<>();
        
        members.put("QB", "joe");
        members.put("WR", "chaise");
        members.put("WR", "higgins");
        members.put("WR", "boyd");
        members.put("OL", "yoshomoto");
        members.put("TE", "tanaka");
        
        String QB =members.get("QB");
        System.out.println("QBは"+QB);
        
        members.put("QB", "corral");
        System.out.println("1番目の要素、置換後："+members.get("QB"));
        
        System.out.println("OLの要素、削除前"+members.get("OL"));
        members.remove("OL");
        System.out.println("OLの要素、削除後"+members.get("OL"));
        
        for (Map.Entry<String, String> entry:members.entrySet()) {
            System.out.println("entrySetキー:"+entry.getKey()+"、値:"+entry.getValue());
        }
       
       
       
        for(String key : members.keySet()) {
            System.out.println("keyset キー:"+key+"値:"+members.get(key));
        }
        
        for(String value : members.values()) {
            System.out.println("values 値："+value);
            
        }
        
        int size =members.size();
        System.out.println("Mapのサイズ(クリア前)"+size);
        members.clear();
        System.out.println("Mapのサイズ（クリア後）"+ members.size());

    }

}
