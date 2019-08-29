import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

WebUI.navigateToUrl(GlobalVariable.AddAdminLogistic)

String stroreIds = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaStoreID'))

String addStoreIds

if (WebUI.verifyTextNotPresent('WARUNGKITA', false, FailureHandling.OPTIONAL)) {
	
	println("WARUNGKITA is not available on page!")
	
	addStoreIds = stroreIds + "," + GlobalVariable.AddLogisticForWarungKita
    
	WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaStoreID'), 
        addStoreIds)
	
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnSave'))
	
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnOke'))

}

WebUI.delay(5)

WebUI.navigateToUrl(GlobalVariable.AddAdminLogistic)

stroreIds = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaStoreID'))

if (WebUI.verifyTextNotPresent('WARUNGKAMI', false, FailureHandling.OPTIONAL)) {
	
	println("WARUNGKAMI is not available on page!")

	addStoreIds = stroreIds + "," + GlobalVariable.AddLogisticForWarungKami
	
	WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaStoreID'),
		addStoreIds)

	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnSave'))
	
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnOke'))
	
    stroreIds = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaStoreID'))
}

WebUI.delay(5)

//WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnSave'))
//
//WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnOke'))

