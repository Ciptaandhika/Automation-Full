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

mydate = new Date()

formattedDate = mydate.format('dd MMM ')

datehour = mydate.format('HHmm')

site_id = (GlobalVariable.registerUKMEvent + formattedDate + datehour)

String site_id2 = site_id.replaceAll('\\s', '')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/hrefEditEventUKM'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEditEventName'), 
    site_id2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/btnSaveEditEventName'))

WebUI.verifyAlertPresent(30)

WebUI.acceptAlert()

