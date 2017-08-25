package demo;

public class MyStringBuilderDemo {
	
	public static void main(String[] args) {
		String palindromes = "Was it a cat I saw?";
		System.out.println(palindromes);
		
		StringBuilder sb = new StringBuilder(palindromes);
		sb.reverse();
		System.out.println(sb);
		
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
		}
		
		int i = 0;
		while(i < args.length){
			String string = args[i];
			System.out.println(string);
			i++;
		}
		
		for (String string : args) {
			System.out.println(string);
		}
	}

}
