package com.Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
/*
 * this method is used to fecth data from excel
 * @param sheetName
 * @param RowNum
 * @param CellNum
 * @return
 * @throws Throwable

 */
	public String getDataFromExcel(String sheetName,int RowNum,int CellNum) throws Throwable
	{
		//FileInputStream fis = new FileInputStream("./Book3.xlsx");
		FileInputStream fis = new FileInputStream(Ipathconstant.PROPERTYFILE_PATH1);
	  	Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
         Row row = sh.getRow(RowNum);
         Cell cell = row.getCell(CellNum);
          String data = cell.getStringCellValue();
		return data;
		
	}
}
