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

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/cbJenisRefund'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/ddMohonPilihSebuahAlasan'), 
    GlobalVariable.index1)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/txtBoxDeskripsiRefund'), GlobalVariable.DeskripsiRefund)

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/btnSubmitRefund'))

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/btnKonfirmasiRefund'))

WebUI.delay(5)

not_run: GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020302_RefundDetail/hrefNomorPemesanan'))

not_run: GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('[^\\d]', '')

