package mypack;

import java.io.FileNotFoundException;

public class Question7 {

	public static void main(String[] args) throws FileNotFoundException {

		try (CustomeAutoClosable autoClose = new CustomeAutoClosable()) {
			autoClose.action();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
//		try {
//			File myObj = new File("/checkTryWithRes.txt");
//			Scanner myReader = new Scanner(myObj);
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println("data : " + data);
//			}
//			myReader.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
	}

}
