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

if (WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/EBVAddPage/cbBoxInputNoExpired'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)) {

	WebUI.uncheck(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/EBVAddPage/cbBoxInputNoExpired'),
	FailureHandling.STOP_ON_FAILURE)

	CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/EBVAddPage/txtBoxInputEndDate'),
	GlobalVariable.endDate)

	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/EBVAddPage/lblEndTime'))

    WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/EBVAddPage/btnSaveEBVAdd'))

} else if (WebUI.verifyElementNotChecked(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/EBVAddPage/cbBoxInputNoExpired'), 
   2, FailureHandling.CONTINUE_ON_FAILURE)){

    WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/EBVAddPage/btnSaveEBVAdd'))
}



