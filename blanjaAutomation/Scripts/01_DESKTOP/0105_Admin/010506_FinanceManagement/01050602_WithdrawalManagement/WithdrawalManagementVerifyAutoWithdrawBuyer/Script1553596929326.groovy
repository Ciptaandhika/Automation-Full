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

WebUI.navigateToUrl(GlobalVariable.urlWithdrawalManagement)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/ddUserRole'), 
    GlobalVariable.index1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabComplete'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

Loop: for (int row = 0; row < rows_count; row++) {
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    println(row)

    //for (int column = 7; column < 11; column++) {
    String celltext = Columns_row.get(2).getText()

    println(celltext //}
        )

    WebUI.verifyTextPresent('Buyer', true)
}

