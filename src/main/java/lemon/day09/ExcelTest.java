package lemon.day09;

import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {

	public static void main(String[] args) throws Exception{
		//通过字节码获得一个流
		InputStream inputStream = ExcelTest.class.getResourceAsStream("/config/user.xlsx");
		//获得一个工作簿对象
		Workbook workbook = WorkbookFactory.create(inputStream);
		//获取一个表单
		Sheet sheet = workbook.getSheetAt(0);
		//获得一行数据
		Row firstRow = sheet.getRow(0);
		
		int lastCellNum = firstRow.getLastCellNum();  //getLastCellNum从0开始加1
		System.out.println(lastCellNum);
		//表单有多少行
		int lastRowNum = sheet.getLastRowNum();//getLastRowNum 从0开始-1
		System.out.println(lastRowNum);
		//创建一个容器，按顺序保存所有的属性名称
		String[] fieldArray = new String[lastCellNum];
		System.out.println(fieldArray.length);
		for(int a=0;a<lastCellNum;a++) {
			Cell cell = firstRow.getCell(a, MissingCellPolicy.CREATE_NULL_AS_BLANK);
			cell.setCellType(CellType.STRING);
			String value = cell.getStringCellValue();
			fieldArray[a] = value;
			System.out.println(value);
		}
		//循环获取第一行s
		for	(int i=0;i<=lastRowNum;i++) {
			//获得当前行
			Row currentRow = sheet.getRow(i);
			
//			fieldArray[i] = outValue;
//			System.out.println(fieldArray[i]);
//			System.out.print(currentRow.getRowNum());
			
			
			for(int j=0;j<lastCellNum+1;j++) {
				Cell cell = currentRow.getCell(j, MissingCellPolicy.CREATE_NULL_AS_BLANK);
				cell.setCellType(CellType.STRING);
				//获得cell的值
				String value = cell.getStringCellValue();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
