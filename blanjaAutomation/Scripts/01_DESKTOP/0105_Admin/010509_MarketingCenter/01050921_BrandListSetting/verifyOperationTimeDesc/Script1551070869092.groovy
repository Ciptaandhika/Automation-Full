import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.text.DateFormat as DateFormat
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//div[@id="promoSectionScheduleLog"]/table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

Loop: for (int row = 0; row < rows_count; row++) {

    if (row > 0) {
        List<WebElement> Columns_row_before = rows_table.get(row - 1).findElements(By.tagName('td'))
	    String operatorTimeBefore = Columns_row_before.get(3).getText().substring(0,19)
		DateFormat df = new SimpleDateFormat('dd/MM/yyyy HH:mm:ss')
		Date d1 = df.parse(operatorTimeBefore)
		
		List<WebElement> Columns_row_after = rows_table.get(row).findElements(By.tagName('td'))
		String operatorTimeAfter = Columns_row_after.get(3).getText().substring(0,19)
		Date d2 = df.parse(operatorTimeAfter)
		
		if(df.format(d1) > df.format(d2)){
			log.logInfo("Passed")
		}else{
			log.logInfo("Failed")
		}
    }
}

