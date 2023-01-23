import java.io.File;
import java.io.FileInputStream;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("not_existing_file.txt");
		FileInputStream stream = new FileInputStream(file);  //handle by try-catch or declare as throws
	}

}
