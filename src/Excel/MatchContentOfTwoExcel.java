package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MatchContentOfTwoExcel {
	public static void main(String[] args) throws  InvalidFormatException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		int rc1=wb.getSheet("sheet1").getLastRowNum();
		 int cl1 = wb.getSheet("sheet1").getRow(rc1).getLastCellNum();
		 int rc2=wb.getSheet("sheet1").getLastRowNum();
		 int cl2 = wb.getSheet("sheet1").getRow(rc2).getLastCellNum();
		 if(rc1==rc2&&cl1==cl2){
		for(int i=0;i<=rc1;i++){
			for(int j=0;j<cl1;j++){
			String v1=	wb.getSheet("sheet1").getRow(i).getCell(j).toString();
			String v2=	wb.getSheet("sheet2").getRow(i).getCell(j).toString();

			System.out.print(v1+" ");
			}
			System.out.println();
		}
	}
}
}