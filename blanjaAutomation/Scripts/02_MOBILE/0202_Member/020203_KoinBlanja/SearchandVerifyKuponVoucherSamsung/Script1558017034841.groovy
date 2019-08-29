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
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

GlobalVariable.noOrderGlobal = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/div_Voucher SamsungKupon'))

println(GlobalVariable.noOrderGlobal)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/btnSearchKuponSaya'))

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtboxSearchNamaKupon'), GlobalVariable.noOrderGlobal)

WebUI.delay(3)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(6)

println(GlobalVariable.noOrderGlobal)

WebUI.clearText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/txtboxSearchNamaKupon'), FailureHandling.STOP_ON_FAILURE)

