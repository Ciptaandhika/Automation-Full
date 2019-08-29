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
import org.openqa.selenium.Keys as Keys

mydate = new Date()

//day = mydate.format('ddMM')

hour = mydate.format('HHmmss')

try {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnXToko'))
}
catch (Exception e) {
} 

WebUI.navigateToUrl(GlobalVariable.URLKelolaAkunTambahan)

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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/hrefKelolaAkunTambahan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/btnTambahAkun'))

GlobalVariable.namaAkunSubSeler = GlobalVariable.namaAkunSubSeler + hour

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/txtBoxNamaAkun'), GlobalVariable.namaAkunSubSeler)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/txtBoxSandiAkun'), GlobalVariable.SandiAkunSubSeller)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/txtBoxSandiAkunConfirm'), 
    GlobalVariable.SandiAkunSubSeller)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/txtBoxNamaAsli'), GlobalVariable.namaAsli)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/rbJenisKelamin'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/btnLanjutkanBuatAkun'))

