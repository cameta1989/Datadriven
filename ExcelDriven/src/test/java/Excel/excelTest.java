package Excel;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import ExcelDriven.dataDriven;

public class excelTest {
	
	@Test
	public void exceldriven() throws IOException
	{
		dataDriven d= new dataDriven();
		ArrayList data= d.getData("Add Profile");
		//ArrayList is generic it captures string as well as integer values
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
			
	}

}
