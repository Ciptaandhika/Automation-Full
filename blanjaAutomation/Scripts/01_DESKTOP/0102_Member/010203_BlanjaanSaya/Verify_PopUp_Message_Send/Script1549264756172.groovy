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

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/lblHubungiPenjual'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0103_Product/010302_Store/btnSendPopUpMessage'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/lblOrderNumberBuyer'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/lblSellerNameWarungKami'), 30)

WebUI.setText(findTestObject('01_DESKTOP/0103_Product/010302_Store/txtareaPopUpMessage'), GlobalVariable.msgHalo)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010302_Store/btnSendPopUpMessage'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010302_Store/lblMessageSentSuccessfully'), 30)

