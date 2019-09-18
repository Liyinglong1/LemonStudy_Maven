package lemon.day17.study.section01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;

public class ExcelUtilsMeWrite {
	public static void writeExcel(String sourceExcelPath,String targetExcelPath,int sheetIndex,String content) throws Exception{
		//将文件加载成一个输入流
		InputStream inputStream = ExcelUtilsMeWrite.class.getResourceAsStream(sourceExcelPath);
		//创建一个工作簿对象
		
		Workbook workBook = WorkbookFactory.create(inputStream);
		//获得表对象
		Sheet sheet = workBook.getSheetAt(sheetIndex);
		
		//获得第一行
		Row firstRow =  sheet.getRow(0);
		//设置单元格类型 instead 
		Cell firstCell = firstRow.getCell(0, MissingCellPolicy.CREATE_NULL_AS_BLANK);
		//写入内容 Content,这一步其实是写入内存中，没有写入Excel
		firstCell.setCellValue(content);
		
		//创建一个输出流
		OutputStream outputStream = new FileOutputStream(targetExcelPath);
		//真正写入Excel中
		workBook.write(outputStream);
		System.out.println("已经打印");
		//关闭流
		outputStream.close();
		workBook.close();
		inputStream.close();
	}
	//一批一批的写
	/**
	 * 一批一批的写入Excel
	 * @param sourcePath
	 * @param targetPath
	 * @param sheetIndex
	 * @throws Exception
	 */
	public void batchWrite(String sourcePath,String targetPath,int sheetIndex) throws Exception {
		//创建一个流
		InputStream inputStream = ExcelUtilsMeWrite.class.getResourceAsStream(sourcePath);
		//创建一个工作簿对象
		Workbook workbook = WorkbookFactory.create(inputStream);
		workbook.getSheetAt(sheetIndex);
	}
	
	
	public static void main(String[] args) {
		try {
			writeExcel("/case17/test_case_01.xlsx","F:\\2.xlsx",0,"你能写进去不");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
