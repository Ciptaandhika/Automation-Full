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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/btnCreateNewEvent'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxInputEventName'), 
    GlobalVariable.ukm007)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxGeneratedURL'), 
    GlobalVariable.ukm007)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEventStartDate'), 
    GlobalVariable.startDate)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxStartTime'), 
    GlobalVariable.startTimeUKMEvent)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEventEndDate'), 
    GlobalVariable.endDate)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/btnCreateDetailEvent'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/lblSecretKeyAlreadyInDB'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/lblEventNameAlreadyInDataBase'), 
    30)

