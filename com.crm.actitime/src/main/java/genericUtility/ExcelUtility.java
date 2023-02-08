package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String fetchDataFromExcel(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./testData/ExcelData.xlsx");
	Workbook workbook = WorkbookFactory.create(fis); //to access workbook interface
	
	 return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
	}
}
