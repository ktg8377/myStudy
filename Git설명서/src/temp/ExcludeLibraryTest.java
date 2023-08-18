package temp;

import java.util.Scanner;

import com.ezen.input.Keyboard;

public class ExcludeLibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Keyboard k = new Keyboard();
		
		Scanner scan = k.geyInstance();
		
		System.out.println("오호라 내가 외부 라이브러리가 사용되네");
		System.out.println(scan.nextLine());
		
	}

}
