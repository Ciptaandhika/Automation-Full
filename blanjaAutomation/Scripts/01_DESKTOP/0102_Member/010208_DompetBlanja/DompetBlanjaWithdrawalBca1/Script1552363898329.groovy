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

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/txtBoxNamaBank'), GlobalVariable.NamaBankDompetBlanja, 
    GlobalVariable.istrue)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/txtBoxBranchName'), GlobalVariable.NamaCabangDompetBlanja)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/txtBoxNamaPemilikBank'), GlobalVariable.NamaPemilikBankDompetBlanja)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/txtBoxNoRek'), GlobalVariable.NoRekDompetBlanja)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/lblJumlah'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/btnSelanjutnya'))

WebUI.setEncryptedText(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/lblPasswordDompetBlanja'), GlobalVariable.PasswordDompetBlanja)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/txtBoxKodeVerifikasi'), GlobalVariable.KodeVerifikasiDompetBlanja)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/btnKodeVerifikasiConfirm'))

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010208_DompetBlanja/div_Info Bank'))

