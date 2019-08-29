import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.temporal.JulianFields

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath("//*[@id='balanceList']/table"))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

println(rows_count)

List<WebElement> Columns_row

for (int row = 1; row <= rows_count; row++) {

Columns_row = rows_table.get(row).findElements(By.tagName('td'))

int columns_count = Columns_row.size()

println(columns_count)

String OrderNumber = Columns_row.get(3).getText().replaceAll("[^0-9]", "")

println(OrderNumber)

if(OrderNumber == GlobalVariable.lastOrderNumberBlanjaanSaya){
	
	Columns_row = rows_table.get(row).findElements(By.tagName('td'))
	
	break;
}
}

String getrefund = GlobalVariable.txtHargaProdukSatuan

int exprefund = getrefund.toInteger() * 2

JumlahRefund = Columns_row.get(2).getText().replaceAll("[^0-9]", "")

println(JumlahRefund)

WebUI.verifyEqual(JumlahRefund, exprefund)

