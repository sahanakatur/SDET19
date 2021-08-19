package AmazonWorkings;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
public class ReadData_Excel {
	
	@Test(dataProvider = "getcities")
	
	public void read_data(String src, String dest) 
	{

	System.out.println(src);
	
	System.out.println(dest);
	
	

	}
	
	@DataProvider
	
	public Object[][] getcities() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./SDET_19/data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Object [][]arr = new Object[5][2];
		
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=2;j++)
			{
				String source = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(source);
				
				String destination = wb.getSheet("Sheet1").getRow(i).getCell(j+1).getStringCellValue();
				System.out.println(destination);
				
				System.out.println(arr[i][j]);
			}
					
		}
		return arr;
	}
	
}*/

public class ReadData_Excel {

	public String readDataExcel(String sheet,int row, int cell ) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("../SDET_19/data.xlsx");

		String  value = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

		return value;
	}

	public int getlastrow() throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("../SDET_19/data.xlsx");
		int lastactivrrow=WorkbookFactory.create(fis).getSheet("Sheet1").getLastRowNum();
		return lastactivrrow;
	}

}
