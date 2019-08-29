import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

List<WebElement> objectLists = WebUI.findWebElements(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/cbxPromo'), 
    0)

String promoName = objectLists.get(1).getAttribute('promoname')

TestObject newObject = new TestObject()

//newObject.addProperty('tag', ConditionType.EQUALS, 'input')
//newObject.addProperty('type', ConditionType.EQUALS, 'checkbox')
//newObject.addProperty('promoname', ConditionType.EQUALS, promoName)
WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

Loop: for (int row = 0; row < rows_count; row++) {
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    String status = Columns_row.get(4).getText()

    if (status.equalsIgnoreCase('Active') || status.equalsIgnoreCase('Has Ended')) {
        println('ini has ended' + Columns_row.get(0).getSize())

        WebUI.verifyTextPresent(status, false)
    }
}

