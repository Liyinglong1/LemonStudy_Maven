package lemon.day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dom4j.Document;

public class Excel_Test {
	public static void main(String[] args) {
		setExcel();
	}
	public static void setExcel() {
		try {
			//创建一个流
			FileInputStream inputStream = new FileInputStream("src/main/resources/config/Test.xlsx");
			//2、获取Excel工作簿对象
			XSSFWorkbook wookBook = new XSSFWorkbook(inputStream);
			//3、得到Excel工作表对象
			XSSFSheet sheet = wookBook.getSheetAt(0);
			//4、获得Excel多少行
			int lastRowNum = sheet.getLastRowNum();
			//5、获得Excel多少列
			XSSFRow firstRow = sheet.getRow(0);
			short lastCellNum = firstRow.getLastCellNum();
			System.out.println(lastCellNum);
			
			//定义一个数组用来存表头名
			String[] methrodName = new String[lastCellNum];
			for(int i=0;i<lastCellNum;i++) {
				XSSFRow current = sheet.getRow(0);
				XSSFCell cell = current.getCell(i, MissingCellPolicy.CREATE_NULL_AS_BLANK);
				cell.setCellType(CellType.STRING);
				String str = cell.getStringCellValue();
				methrodName[i] = str;
			}
			System.out.println(methrodName[1]);
			//4、循环读取表格数据
			for (int i = 1; i <=lastRowNum; i++) {
				XSSFRow current = sheet.getRow(i);
//				System.out.println(current);
				for (int j = 0; j < lastCellNum; j++) {
					XSSFCell cell = current.getCell(j, MissingCellPolicy.CREATE_NULL_AS_BLANK);
					cell.setCellType(CellType.STRING);
					String cellValue = cell.getStringCellValue();
					System.out.print(cellValue+"   ");
					
					//通过字节码对象
					Class<User> clazz =  User.class;
					//通过表头数据 写方法名
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
