package onlineCode;

/**
 * @author ashraf
 *
 */
public class CsvWriteReadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fileName = System.getProperty("user.home")+"/student.csv";
		
		System.out.println("Write CSV file:");
		CsvFileWriter.writeCsvFile(fileName);
		

	}

}