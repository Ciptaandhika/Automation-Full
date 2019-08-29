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

Date mydate = new Date()

String formattedDate = mydate.format('ddMM')

String datehour = mydate.format('HHmmss')

formatPhone = (formattedDate + datehour)

formatMail = '@gmail.com'

mailRegister = (((GlobalVariable.namaBelakangInputFieldMandatoryBuyer + formattedDate) + datehour) + formatMail)

String dynamicUsername = (GlobalVariable.usernameRegister + formattedDate) + datehour

String dynamicPhoneNumber = formattedDate + datehour

String dynamicMail = ((GlobalVariable.usernameRegister + formattedDate) + datehour) + formatMail

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxUserName'), dynamicUsername)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxNomorHandphone'), dynamicPhoneNumber)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxEmail'), dynamicMail)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxPasswordRegisterBlanja'), GlobalVariable.password123)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/txtboxConfirmPasswordRegisterBlanja'), GlobalVariable.password123)

WebUI.check(findTestObject('01_DESKTOP/0102_Member/rbMaleGender'))

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/HomepageIndah/txtboxInputCaptha'), GlobalVariable.KodeCapcha)

WebUI.delay(15)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/btnDaftarAkunBlanja'), FailureHandling.STOP_ON_FAILURE)

GlobalVariable.contentText = dynamicUsername

