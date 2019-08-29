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

WebUI.navigateToUrl('https://member.bljstaging.com/balanceAndWithdraw')

WebUI.click(findTestObject('BtnBlanjaanSayaOK'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/ListRowPertama'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/btnGo'), 0)

WebUI.delay(2)

keterangantakerate = WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/objectTbody'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(keterangantakerate, ('Blanja menarik biaya komisi dari penjual {' + GlobalVariable.lastOrderNumberBlanjaanSaya) + 
    '}', false)

