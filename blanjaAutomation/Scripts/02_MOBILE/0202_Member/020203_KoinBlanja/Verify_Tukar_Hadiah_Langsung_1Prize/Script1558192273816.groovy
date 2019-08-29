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

WebUI.delay(3)

amountCoin = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/lblKoinBlanjaBuyer'))

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/btnTukarDirectPrize1'))

WebUI.delay(2)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/btnYaDirectPrize1'))

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/lblSuccessEmailMessage'), 
    60)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/btnViewPrize'), 
    60)

WebUI.refresh()

WebUI.delay(3)

currentCoin = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/lblKoinBlanjaBuyer'))

if(WebUI.verifyNotEqual(amountCoin, currentCoin)){
	
	println('Koin Berkurang')
	 
} else {
  
  println('Koin Tidak Berkurang')

}

