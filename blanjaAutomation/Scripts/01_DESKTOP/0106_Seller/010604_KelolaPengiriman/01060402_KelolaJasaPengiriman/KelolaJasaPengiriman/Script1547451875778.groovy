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

/*
if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnXToko'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnXToko'))
} else {
}

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btKelolaProd'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btKelolaProd'))
} else {
}

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btnPilihJasa'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btnPilihJasa'))
} else {
}

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btAturJasa'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btAturJasa'))
} else {
}
*/
WebUI.navigateToUrl(GlobalVariable.URLlistJasaPengiriman, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/hrefKelolaJasaPengiriman'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/hrefKelolaJasaPengiriman'), 
    0)

