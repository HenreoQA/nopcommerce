package utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="Logindata")
	public String [][] getData() throws IOException
	{
		String path=".\\Testdata\\nopcommerce_LoginData.xlsx"; //taking xl file from Testdata
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
	
	//DataProvider 2
	
	 @DataProvider(name="dpp")
//   @DataProvider(name="dpp", indices = {0,3}) // if you want to execute the first and last statements
	  String[][] loginData()
	  {
		  String data[][] = {
				        
				              {"guy@gmail.com", "test123"},
				              {"member@gmail.com", "member123"},
				              {"henry@gmail.com", "member234"},
				              {"guy@gmail.com", "test123"},
				              
				              
				          
				            };
		  return data;
	  
	  }

	
	//DataProvider 3
	
	//DataProvider 4
}

