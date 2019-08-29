import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxJudulPromosi'), GlobalVariable.txtBoxPromotionName3)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/startDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/endDate'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxDiskon'), GlobalVariable.discountKopiLTD)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnTambahkanProduk'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxProductIdLtd'), GlobalVariable.txtBoxProductId5)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnSearchItem'))

//String xpath = "//input[@type = 'checkbox' and @id = 'limitItems_" + GlobalVariable.txtBoxProductId5 + "']"
//WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/cbItem'))

String xpath = "//*[@id = 'limitItems_" + GlobalVariable.txtBoxProductId5 + "']"

String id_path = "limitItems_" + GlobalVariable.txtBoxProductId5

println(xpath)

println(id_path)

TestObject dynamicObject = new TestObject()

//dynamicObject.addProperty("xpath", ConditionType.EQUALS, xpath)

dynamicObject.addProperty("id", ConditionType.EQUALS, id_path)

WebUI.delay(5)

WebUI.check(dynamicObject)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxStokPromosiSHB'), GlobalVariable.maxItem)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxKuotaPembeliSHB'), GlobalVariable.ratingProduct)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnTambahLtd'))

WebUI.delay(5)

alert = WebUI.getAlertText()

log.logInfo(alert)

WebUI.acceptAlert()

WebUI.verifyTextPresent(GlobalVariable.txtBoxPromotionName3, true)

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[4]/div/div/div[3]/div/div/table/tbody"))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
 
List<WebElement> Columns_row = rows_table.get(0).findElements(By.tagName('td'))

int col_count = Columns_row.size()

println(col_count)

List<WebElement> inside_col = Columns_row.get(5).findElements(By.tagName('a'))

GlobalVariable.urlEvent2 = inside_col.get(0).getAttribute('value_date')

println(GlobalVariable.urlEvent2)


