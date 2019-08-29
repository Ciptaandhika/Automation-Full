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

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.URLPengaturanPromosi)

mydate = new Date()

formattedDate = mydate.format('dd/MM/yyyy')

use(TimeCategory, { 
        endTime = (mydate + 3.days)
    })

endDate = endTime.format('dd/MM/yyyy')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtboxNameLTD'), 
    GlobalVariable.promoKopiLTD)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtboxStartTimeLoxiaError'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtboxStartDateTimeLTD'), 
    formattedDate)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtboxEndTimeLoxiaError'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtboxEndDateTimeLTD'), 
    endDate)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtboxDiscountItem'), 
    GlobalVariable.discountKopiLTD)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/btnTambahkanProdukLTD'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtboxStokUntukPromosi'), 
    GlobalVariable.txtBoxQty50)

WebUI.check(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/cbKopiBubuk100LTD'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/btnTambahLTDDiscount'))

WebUI.acceptAlert()

String PromoName = WebUI.getText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/hrefPromoLTDName'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(GlobalVariable.promoKopiLTD, PromoName, false)

WebUI.delay(2)

WebUI.comment('verify that the product selected is successfully applied with promotion/discount')

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/hrefDetailKopiBubuk'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/hrefItemAppliedLTDKopiBubuk'), 
    60)

WebUI.comment('End Promo LTD')

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/hrefBatalkanPromo'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/hrefHapusLTDPromotion'))

WebUI.delay(3)

WebUI.acceptAlert()

