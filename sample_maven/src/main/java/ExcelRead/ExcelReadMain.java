package ExcelRead;

import java.io.IOException;

public class ExcelReadMain {

	public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelRead1.getStringData(1, 0));
		System.out.println(ExcelRead1.getIntegerData(1, 1));
		System.out.println(ExcelRead1.getStringData(2, 0));
		System.out.println(ExcelRead1.getIntegerData(2, 1));
		
	}

}
