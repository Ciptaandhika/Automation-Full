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

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxUserName'), GlobalVariable.usernameRegister)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxNomorHandphone'), GlobalVariable.inputRegisterNumber)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxEmail'), GlobalVariable.emailregister)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0102_Member/rbMaleGender2'), 30)

WebUI.delay(12)

WebUI.comment('Empty Password')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), '')

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/lblPasswordKolomWajibDiisi'), 0)

WebUI.delay(3)

WebUI.clearText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'))

WebUI.comment('Password Harus Lebih Dari 6')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), GlobalVariable.passNot6Char)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/lblPasswordKolomHarusLebihDari6Karakter'), 0)

WebUI.delay(3)

WebUI.clearText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'))

WebUI.comment('Password Harus Kurang Dari 16')

WebUI.delay(4)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), GlobalVariable.passMore16Char)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/lblPasswordHarusKurangDari16Karakter'), 0)

WebUI.delay(3)

WebUI.clearText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'))

WebUI.delay(5)

WebUI.comment('Password Harus Mengandung Huruf-Angka')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), GlobalVariable.pass6AsChar)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/lblHarusMengandungHurufdanAngka'), 0)

WebUI.clearText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'))

WebUI.delay(5)

WebUI.comment('Password Harus Mengandung Huruf-Angka')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), GlobalVariable.pass6AsNumber)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/lblPasswordKriteriaSemua'), 0)

WebUI.clearText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'))

WebUI.comment('Password Harus Mengandung Huruf-Angka')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), GlobalVariable.pass6AsSpecialChar)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/lblPasswordKriteriaSemua'), 0)

WebUI.clearText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'))

WebUI.delay(5)

WebUI.comment('Password harus 6-16, dan terdiri dari kombinasi karakter')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), GlobalVariable.passCombiSpecialCharNum)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010201_LoginPage/lbl616CharKombinasi'), 0)

WebUI.clearText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'))

WebUI.delay(5)

WebUI.comment('Password harus 6-16, dan terdiri dari kombinasi karakter')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), GlobalVariable.passCombiSpecialChar)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010201_LoginPage/lbl616CharKombinasi'), 0)

