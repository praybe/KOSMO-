package Oct20;

//13장. 배열기반 반복문 활용의 예


public class ArrBox {
	public static void main(String[] args) {
		
		String[] sr = new String[7];
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");
		sr[4] = new String("Tree");
		sr[5] = new String("Dinner");
		sr[6] = new String("Brunch cafe");
		
		int cnum = 0;
		for(int i = 0; i < sr.length; i++) 
			cnum += sr[i].length();
			
		System.out.println("총 문자의 수: " +cnum);
		

	}

}
