package generic_script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_generic {
	public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./poi/nandish.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		 Cell sh = book.getSheet(sheet).getRow(row).getCell(cell);
		 String value = sh.getStringCellValue();
		return value;
		 
		
	}
	

}
