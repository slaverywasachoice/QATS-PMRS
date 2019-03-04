package pmrsQATS

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import com.kms.katalon.core.annotation.Keyword

import com.mysql.jdbc.Connection
import internal.GlobalVariable

public class connectDB {

	/*
	 * url - jdbc:mysql://pmrs.c4orxtkfp1ro.ap-southeast-1.rds.amazonaws.com/pmrsdb
	 * user - pmrs_apps
	 * password - f66148143a9f487abaaf0e24a15937f5cc57e827
	 * driverClassName - com.mysql.jdbc.Driver
	 * 
	 * */

	private static Connection connection = null;

	@Keyword
	def connectToDB(String url, String username, String password,String dbname){

		//Load driver class for your specific database type
		String conn = "jdbc:mysql://" + url + "/" + dbname
		//Class.forName("org.sqlite.JDBC")
		//String connectionString = "jdbc:sqlite:" + dataFile
		if(connection != null && !connection.isClosed()){

			connection.close()

		}
		connection = DriverManager.getConnection(conn, username, password)
	}


	@Keyword
	def executeQuery(String queryString)
	{
		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)
		
		println rs;
		return rs
	}


	@Keyword
	def closeDatabaseConnection() {
		if(connection != null && !connection.isClosed())
		{
			connection.close()
		}

		connection = null

	}


}

