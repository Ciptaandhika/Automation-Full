import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.urlMemberOrderListBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/txtBoxOrderNumberBlanjaanSaya'), GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnCari'))

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath("//table/tbody"))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

List<WebElement> Columns_row = rows_table.get(0).findElements(By.tagName('td'))

GlobalVariable.txtHargaProdukSatuan = Columns_row.get(1).getText().replaceAll("[^0-9]", "")

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/CategoryHomepage/hrefPengembalianBarangRefund'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/CategoryHomepage/hrefPengembalianBarangRefund'))

WebUI.switchToWindowIndex(GlobalVariable.index1)

