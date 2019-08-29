import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl(GlobalVariable.URLMWebProdukReguler50kMainsiteWarungKitam)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtJumlahItem'), 0)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtJumlahItem'))

WebUI.sendKeys(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtJumlahItem'), Keys.chord(Keys.DELETE))

WebUI.delay(5)

WebUI.setText(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtJumlahItem'), '4')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnAddToCart'), 0)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnAddToCart'))

WebUI.delay(5)

