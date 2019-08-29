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

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/btnPlusXPath'))

WebUI.delay(3)

qty1 = WebUI.getAttribute(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/txtboxInputQtyXpath'), 'value')

println(qty1)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/btnMinusXPath'))

WebUI.delay(3)

qty2 = WebUI.getAttribute(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/txtboxInputQtyXpath'), 'value')

if (WebUI.verifyNotEqual(qty1, qty2)) {
    println('Jumlah Berkurang')
} else {
    println('Jumlah Tidak Berkurang')
}

qty2 = WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/btnMinusDisabled'), 30)

