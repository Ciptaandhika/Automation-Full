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

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnX'))

not_run: if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btKelolaProd'), 2, 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btKelolaProd'))
} else {
}

not_run: if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btnPilihJasa'), 2, 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btnPilihJasa'))
} else {
}

not_run: if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btAturJasa'), 2, 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btAturJasa'))
} else {
}

WebUI.navigateToUrl(GlobalVariable.urlSeller)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnXInsideSeller'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/hrefKelolaAkunTambahan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/hrefAksesSubaccountSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbKelolaPemesananAkunSetting'))

not_run: WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbKelolaJasaPengiriman'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/btnSimpanSubAccSetting'))

