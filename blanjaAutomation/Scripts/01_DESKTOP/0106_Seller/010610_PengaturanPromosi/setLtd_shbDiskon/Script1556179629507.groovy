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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

KeywordLogger log = new KeywordLogger()

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxJudulPromosi'), GlobalVariable.txtBoxPromotionName3)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/startDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/endDate'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtboxDiscountItem'), 
    GlobalVariable.discountKopiLTD)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnTambahkanProduk'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtBoxProductName'), 
    'Kopi Bubuk 100gr')

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/btnSearchProduct'))

List<WebElement> objectLists = WebUI.findWebElements(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/cbSHB'), 
    0)

println('ini size' + objectLists.size())

objectLists.get(1).click()

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxStokPromosiSHB'), GlobalVariable.maxItem)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxKuotaPembeliSHB'), GlobalVariable.ratingProduct)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnTambahLtd'))

WebUI.delay(5)

WebUI.acceptAlert()

