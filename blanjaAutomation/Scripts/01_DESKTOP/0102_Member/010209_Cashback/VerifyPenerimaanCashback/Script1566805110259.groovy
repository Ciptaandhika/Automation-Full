import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010209_Cashback/tabPenerimaan'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> cashbacklist = driver.findElements(By.className("cashback-log-table-body__row"))

int countlist = cashbacklist.size()

println(countlist)

for (int count = 1 ; count <= countlist ; count++){
	
	xpath_col1 = "//*[@id='myCashbackLog']/div[" + count + "]/div[1]"
	
	TestObject Transaksi = new TestObject()
	
	Transaksi.addProperty("xpath", ConditionType.EQUALS, xpath_col1)
	
	NomorOrder = WebUI.getText(Transaksi).replaceAll("[^0-9]", "")
	
	if (NomorOrder.contains(GlobalVariable.lastOrderNumberBlanjaanSaya)){
		xpath_col3 = "//*[@id='myCashbackLog']/div[" + count + "]/div[3]"
		 
		TestObject Jumlah = new TestObject()
		 
		Jumlah.addProperty("xpath", ConditionType.EQUALS, xpath_col3)
		
		JumlahRefund = WebUI.getText(Jumlah).replaceAll("[^0-9]", "")
		
		WebUI.verifyEqual(JumlahRefund, GlobalVariable.subTotalAmount5K)
		
		break;
	}
}