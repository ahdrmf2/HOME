package HOME;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Although the world is full of suffering, it is full also of the overcoming of it.";
		
		StringTokenizer st1 = new StringTokenizer(msg);
		System.out.println("토큰 수 : " + st1.countTokens());
		System.out.println("=========================");
		String s = "id=guest*name=Amy&pwd = 1004";
		
		StringTokenizer st3 = new StringTokenizer(s, "=&");
				while(st3.hasMoreElements())
					System.out.println(st3.nextToken());
	
	}

}
