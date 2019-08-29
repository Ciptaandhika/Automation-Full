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
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

WebUI.navigateToUrl('https://member.bljstaging.com/shopnwinpoints')

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/BuyerOrderListPage/hrefOKTcash'), 
    2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/BuyerOrderListPage/hrefOKTcash'), 
        FailureHandling.OPTIONAL)
} else {
}

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/BuyerOrderListPage/hrefOKTcash'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/labelHadiahLangsung'))

WebUI.delay(6)

Robot robot = new Robot()
robot.keyPress(KeyEvent.VK_CONTROL)
robot.keyPress(KeyEvent.VK_T)
robot.keyRelease(KeyEvent.VK_CONTROL)
robot.keyRelease(KeyEvent.VK_T)

WebUI.delay(6)

WebUI.switchToWindowIndex(1)

WebUI.delay(6)

WebUI.navigateToUrl(GlobalVariable.URLMemberMainsite)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010201_LoginPage/txtBoxUsernameBuyer01'), GlobalVariable.usernameBuyerTest05)

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010201_LoginPage/txtBoxPassword'), GlobalVariable.passwordQWE)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010201_LoginPage/btnMasuk'))

WebUI.delay(6)

WebUI.navigateToUrl('https://member.bljstaging.com/shopnwinpoints')

