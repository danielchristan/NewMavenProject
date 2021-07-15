package org.test.hcl;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox.KeySelectionManager;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	
	static WebDriver driver;
	
	public static void browserConfig() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Booking\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	public static void openUrl(String url) {
		
		driver.get(url);
		
	}

	public static void maxWindow() {
		
		driver.manage().window().maximize();
	}
	
	public static void type(WebElement element, String data) {
		
		element.sendKeys(data);
		
	}
	
	public static void click(WebElement element) {
		
		element.click();
	}
	
	
	public static void dropDown(WebElement element, String data) {
		
		Select s= new Select(element);
		s.selectByVisibleText(data);
		
	}
	
	public static void dropDown1(WebElement element, String data) {
		Select s= new Select(element);
		s.selectByValue(data);	
	}
	

	public static void keyBoard(WebElement element, int KeyEvent ) throws AWTException {
		
		Robot r=new Robot();
		r.keyPress(KeyEvent);
		
	}
	
	public static void keyBoard1(WebElement element, int KeyEvent) throws AWTException {
		
		Robot r=new Robot();
		r.keyRelease(KeyEvent);	
	}
	
	public static void scrollDown(JavascriptExecutor arg, WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		
	}
	
	public static String excelRead(String Location, String sheet1, int row1, int cell1) throws Exception {
		
		File f=new File(Location);
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet(sheet1);
		Row row = sheet.getRow(row1);
		Cell cell = row.getCell(cell1);
		
		String value="";
		
		int cellType = cell.getCellType();
		
		if (cellType==1) {
			
			value = cell.getStringCellValue();
		}
		
		else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
				value =sim.format(dateCellValue);		
		}
			
		else {
			
			double numericCellValue = cell.getNumericCellValue();
			long l=(long) numericCellValue;
			value = String.valueOf(l);
		}
			
			
		}
		return value;
	}
	
	
	public static void excelWrite(String Location, String sheet1, int row2, int cell2, String cellvalue2) throws Exception {
		
		File f=new File(Location);
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet(sheet1);
		Row createRow = sheet.createRow(row2);
		Cell createCell = createRow.createCell(cell2);
		createCell.setCellValue(cellvalue2);
		
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
		
	}

		
	}


