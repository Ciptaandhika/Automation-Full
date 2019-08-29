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
import groovy.time.TimeCategory as TimeCategory
import org.openqa.selenium.WebElement as WebElement

mydate = new Date()

formattedDate = mydate.format('dd MMM ')

datehour1 = mydate.format('HHmmss')

datehour = mydate.format('HHmmssa')

use(TimeCategory, { 
        startMinutes = (mydate + 30.seconds)

        endMinutes = (mydate + 2.minutes)
    })

newMinute = startMinutes.format('HHmmssa')

endMinute = endMinutes.format('HHmmssa')

site_id = ((GlobalVariable.registerUKMEvent + formattedDate) + datehour1)

String site_id2 = site_id.replaceAll('\\s', '')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/btnCreateNewEvent'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxInputEventName'), 
    site_id2)

eventName = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxInputEventName'), 
    'value')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxGeneratedURL'), 
    site_id2)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEventStartDate'), 
    GlobalVariable.startDate)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxStartTime'), 
    newMinute)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEventEndDate'), 
    GlobalVariable.startDate)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEndTime'), 
    endMinute)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/btnCreateDetailEvent'), 
    30)

WebUI.verifyAlertPresent(30)

WebUI.acceptAlert()

WebUI.delay(65)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxSearchEventName'), 
    eventName)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxSearchRegisterEvent'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/btnCreateNewEvent'))

WebUI.back()

