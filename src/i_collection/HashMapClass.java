package i_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Object put (Obcject ket ,Object value) :
		 */
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("a", 10);
		map.put("b", "홍길동");
		map.put("c", new Date());
		
		System.out.println(map);
		
		map.put("b", "이순신");
		
		System.out.println(map);
		
		map.remove("a");
		
		System.out.println(map);
		
		Object value = map.get("b");
		System.out.println(value);
		
		
		Set<String> keys = map.keySet();
		
		for(String key : keys){
			System.out.println(key + " : " + map.get(key));
		}
		
		
		System.out.println("---");
		
		HashMap<String, String> user = new HashMap<>();
		
		user.put("id","admin");
		user.put("password","admin123");
		user.put("name","관리자");
		user.put("tel","010-1234-5678");
		
		
		Set<String> infos = user.keySet();
		
		for(String info : infos){
			System.out.println(info+ " : " + user.get(info));
		}
		
		HashMap<String, String> user2 = new HashMap<>();
		
		user2.put("id","Notadmin");
		user2.put("password","Notadmin123");
		user2.put("name","관리자아님");
		user2.put("tel","010-8765-4321");
			
		ArrayList<HashMap<String, String>> table = new ArrayList<>();
		
		table.add(user);
		table.add(user2);
		
		System.out.println(table);
		
		for(int i =0; i< table.size();i++){
			
		
		
		System.out.println(table.get(i).get("id")+"\t"+table.get(i).get("password")+"\t"+table.get(i).get("name")+"\t"+table.get(i).get("tel"));
	
		
		}
		
		
	}

}
