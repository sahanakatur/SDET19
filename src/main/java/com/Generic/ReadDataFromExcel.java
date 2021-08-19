package com.Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
		public String readDataExcel(String sheet,int row, int cell ) throws EncryptedDocumentException, IOException {

			FileInputStream fis = new FileInputStream(AutoConstants.Excel_path);

			String  value = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

			return value;
		}

		public int getlastrow() throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis = new FileInputStream(AutoConstants.Excel_path);
			int lastactivrrow=WorkbookFactory.create(fis).getSheet("Sheet1").getLastRowNum();
			return lastactivrrow;
		}

		
	}



