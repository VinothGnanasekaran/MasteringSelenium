package loginDD;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login_ApachePOI {

	List<String> userNameList = new ArrayList<String>();
	List<String> passwordNameList = new ArrayList<String>();

	public  void readExcelData() throws IOException {
		FileInputStream excel = new FileInputStream("D:\\Automation\\Data\\LoginData_POI.xlsx");
		Workbook workBook = new XSSFWorkbook(excel);
		Sheet sheet = workBook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();
			Iterator<Cell> columIterator = rowValue.iterator();

			int i=2;
			while (columIterator.hasNext()) {
				if (i%2==0) {
					userNameList.add(columIterator.next().toString());
					System.out.println("Username : "+userNameList );
				}
				else {
					passwordNameList.add(columIterator.next().toString());
					System.out.println("Password : "+passwordNameList);
				}
				i++;
			}

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Login_ApachePOI obj = new Login_ApachePOI();
		obj.readExcelData();

	}

}
