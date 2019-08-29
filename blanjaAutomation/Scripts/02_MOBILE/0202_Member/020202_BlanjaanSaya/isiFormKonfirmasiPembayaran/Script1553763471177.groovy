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

WebUI.click(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/transferKe'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/norekMandiriBlanja'))

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/norekMandiriBlanja'))

GlobalVariable.nominalKonfirmasiPembayaran = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/totalHarusDibayar')).replaceAll(
    '[//d]', '')

println('sebelum replaceall'+ WebUI.getText(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/totalHarusDibayar')))

println('ini isinya replaceall' + GlobalVariable.nominalKonfirmasiPembayaran)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/txtBoxNominal'), GlobalVariable.nominalKonfirmasiPembayaran)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/txtBoxNoRekPengirim'), GlobalVariable.nomorRekeningPengirim)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/bankPengirim'))

WebUI.mouseOver(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/mandiri'))

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/mandiri'))

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/txtBoxNamaPemilikRek'), GlobalVariable.namaPemilikRekening)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/txtareaNotes'), '')

String Projectpath = System.getProperty('user.dir')

println(Projectpath)

String Filepath = Projectpath + GlobalVariable.relativeImage

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/btnPilihGambar'), 
    Filepath)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/btnSimpan'))

alertText = WebUI.getAlertText()

WebUI.verifyEqual(alertText, 'success confirmation')

