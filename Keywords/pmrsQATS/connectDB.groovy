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
import groovy.sql.Sql
import java.sql.*
import internal.GlobalVariable

public class connectDB {
	
	/*
	 * url - jdbc:mysql://pmrs.c4orxtkfp1ro.ap-southeast-1.rds.amazonaws.com/pmrsdb
	 * user - pmrs_apps
	 * password - f66148143a9f487abaaf0e24a15937f5cc57e827
	 * driverClassName - com.mysql.jdbc.Driver
	 * 
	 * */

	@Keyword
	public connection(String url, String user, String password, String driverClassName) {
		def sqlConnection = Sql.newInstance(url,user,password,driverClassName);
		sqlConnection.eachRow("SELECT * FROM pmrsdb.doctor") { row ->
			for(int x=0;x<5;x++) {
				println row[x]
			}
		}
	}
}
