import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import java.lang.Integer as Integer

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefTroliHomePage'))

qtyforcart = '5'

hargacart = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/PriceContainer'))

hargacart = hargacart.replaceAll('\\D+', '')

hargacart.toInteger()

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/txtQtyAmount'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/txtQtyAmount'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/txtQtyAmount'), qtyforcart)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/PriceContainer'))

totalamount = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/totalAmount'))

totalamount = totalamount.replaceAll('\\D+', '')

totalamount = totalamount.toInteger()

qtyforcart = qtyforcart.toInteger()

perkalianamount = (hargacart.toInteger() * qtyforcart.toInteger())

WebUI.verifyEqual(perkalianamount, totalamount)

