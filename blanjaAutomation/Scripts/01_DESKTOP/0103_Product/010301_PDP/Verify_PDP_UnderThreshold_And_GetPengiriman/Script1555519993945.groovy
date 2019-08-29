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

WebUI.navigateToUrl(GlobalVariable.URLProdukReguler10KMainsiteWarungKami)

try {
    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/close_dialog_gojek'))
}
catch (Exception e) {
} 

shippingFee = WebUI.getText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblPDPBiayaPengiriman'))

productPrice = WebUI.getText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblPDPHargaProduk'))

newShippingFee = shippingFee.replaceAll('[^0-9]', '')

newProductPrice = productPrice.replaceAll('[^0-9]', '')

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnBlanjaSekarang'))

if (newProductPrice < GlobalVariable.txtKoinBlanja_ThresholdSpend) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddOrderConfirmJasaPengiriman'), 
        GlobalVariable.index1)

    WebUI.delay(3)

    ShippingFee = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblShippingFeePromotion'), FailureHandling.STOP_ON_FAILURE)

    println(ShippingFee)
} else {
    println('Barang ini Mempunyai Promo Free Shipping')
}
