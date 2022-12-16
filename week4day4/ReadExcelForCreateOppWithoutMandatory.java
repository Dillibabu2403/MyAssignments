package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelForCreateOppWithoutMandatory {

public static String[][] read() throws IOException {
	XSSFWorkbook wb=new XSSFWorkbook("./Data/CreateOpportunityWithoutMandatoryFields.xlsx");
	XSSFSheet sheet=wb.getSheetAt(0);
	int rowCount = sheet.getLastRowNum();
	System.out.println(rowCount);
	int cellNum = sheet.getRow(0).getLastCellNum();
	System.out.println(cellNum);
	String[][]data=new String[rowCount][cellNum];
	for(int i=1;i<=rowCount;i++) {
		XSSFRow firstData1 = sheet.getRow(i);
		for(int j=0;j<cellNum;j++) {
XSSFCell cell2 = firstData1.getCell(j);
System.out.println(cell2.getStringCellValue());
data[i-1][j]=cell2.getStringCellValue();
	}
	}
	wb.close();
	return data;
}
}
	

