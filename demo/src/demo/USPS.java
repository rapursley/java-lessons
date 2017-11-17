package demo;
import java.util.*;

public class USPS {

	public static void main(String[] args) {
		Map<String, String> states = new HashMap<>();
		states.put("NC", "North Carolina");
		states.put("MO", "Missouri");
		System.out.println(states.get("NC"));
		System.out.println(states.keySet());
		System.out.println(states);
	}

}
