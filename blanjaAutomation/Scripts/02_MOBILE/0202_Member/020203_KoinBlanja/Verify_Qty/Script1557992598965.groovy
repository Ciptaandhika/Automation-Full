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

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/lblTabLainnya'))

WebUI.delay(3)

WebUI.clearText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'), GlobalVariable.qty5)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Unidan Section/btnMines'))

WebUI.delay(3)

String value1 = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'))

//WebUI.getAttribute(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'), 'value')
if (value1 != GlobalVariable.qty5) {
    println('Value is Decreased')

    println(value1)
} else {
    println('Not Passed')

    println(value1)
}

//WebUI.delay(3)
//
//WebUI.clearText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'))
//
//WebUI.setText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'), GlobalVariable.ExtraPoint1)
//
//WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Unidan Section/btnMines'))
//
//if (WebUI.getAttribute(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'), 'value') == GlobalVariable.ExtraPoint1) {
//    println('Value Keep Still')
//} else {
//    println('Not Passed')
//}
WebUI.delay(3)

WebUI.clearText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'))

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtBoxHadiahUndian'), GlobalVariable.ExtraPoint1)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Unidan Section/btnMines'), 0)

