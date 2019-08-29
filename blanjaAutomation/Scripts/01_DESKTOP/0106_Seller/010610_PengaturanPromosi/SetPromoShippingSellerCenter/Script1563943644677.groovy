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

WebUI.navigateToUrl(GlobalVariable.URLPromoShippingSellerCenter)

if(WebUI.verifyElementNotPresent(findTestObject("01_DESKTOP/0106_Seller/010609_PengaturanPromosi/btnBatalkanPromo"), 5, FailureHandling.OPTIONAL)){

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/txtJudulPromosi_Diskon'), GlobalVariable.JudulPromosi)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/txtStartDate_Diskon'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/txtEndDate_Diskon'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/txtPemesananLebihDari'), GlobalVariable.Treshold20k)

WebUI.check(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/cbPengirimanGratisSeller'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/selectSeluruhIndonesia'), 'all', 
    false)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/btnTambah_Diskon'))

WebUI.acceptAlert()

}

