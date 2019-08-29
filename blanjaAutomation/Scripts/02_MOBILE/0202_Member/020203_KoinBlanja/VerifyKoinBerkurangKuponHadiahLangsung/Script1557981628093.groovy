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

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/lblTabLainnya'))

WebUI.delay(3)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'), GlobalVariable.batasBeli)

WebUI.delay(3)

WebUI.click(findTestObject('btnTukarNew'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/btnYa'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/lblPopUpBerhasil'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

SuccesURL = WebUI.getUrl()

SuccesURL.contains('success')

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/lblKoin'), 6)

