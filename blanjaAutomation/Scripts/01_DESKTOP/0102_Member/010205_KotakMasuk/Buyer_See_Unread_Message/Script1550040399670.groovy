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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/hrefBelumDiBaca'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/cbAllKotakMasukBuyer'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/ddMessageBuyer'), GlobalVariable.index1)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/btnGoMessage'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/lblBelumAdaPesan'), 60)

