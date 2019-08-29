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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.urlhomepage)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnCloseXPanduan'))

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/txtBoxSearchKeyWords'), GlobalVariable.nameKopiBubuk)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/HomepageBilly/btnSearchCategory'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/NewAndSecondProduct/ddNewSecondConditionProduct'), 
    GlobalVariable.ddIndexValue)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010104_SearchProduct/lblBekas'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010104_SearchProduct/lblSearchResultKopiBubukBekas'), 
    30)
