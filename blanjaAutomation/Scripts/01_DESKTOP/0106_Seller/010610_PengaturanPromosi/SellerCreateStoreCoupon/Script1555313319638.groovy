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
import groovy.time.TimeCategory as TimeCategory
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/lblDiskonSeller'))

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/btnBatalkanPromo'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/btnBatalkanPromo'), FailureHandling.OPTIONAL)

    WebUI.acceptAlert(FailureHandling.OPTIONAL)
} else {
}

CustomKeywords.'com.mii.DynamicGlobalVariable.dynamicvariable'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/lblJudulPromosiSeller'), 
    GlobalVariable.JudulPromosiSeller)

WebUI.delay(3)

mydate = new Date()

formattedDate = mydate.format('dd/MM/yyyy')

use(TimeCategory, { 
        endTime = (mydate + 3.days)
    })

endDate = endTime.format('dd/MM/yyyy')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/lblStartDateSeller'), formattedDate)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/lblEndDateSeller'), endDate)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/lblBatasSeller'), GlobalVariable.BatasPromo)

WebUI.check(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/cbPengirimanGratisSeller'))

WebUI.check(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/lblSeluruhIndonesia'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/btnTambah'))

WebUI.acceptAlert()

