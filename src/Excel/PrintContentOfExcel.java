package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintContentOfExcel {
public static void main(String[] args) throws  InvalidFormatException, FileNotFoundException, IOException {
	Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
	int rc=wb.getSheet("sheet1").getLastRowNum();
	 int cl = wb.getSheet("sheet1").getRow(rc).getLastCellNum();
	for(int i=0;i<=rc;i++){
		for(int j=0;j<cl;j++){
		String s=	wb.getSheet("sheet1").getRow(i).getCell(j).toString();
		System.out.print(s+" ");
		}
		System.out.println();
	}
}
}
