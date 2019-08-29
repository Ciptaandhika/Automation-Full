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

WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/labelProdukYgdipesan'), 0)

WebUI.delay(3)

hargaproduk = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelHargaBarang')).replaceAll("[^0-9]", "")

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/selectJasaPengiriman'), GlobalVariable.kurirStandarOrderConfirm,
   false)

WebUI.delay(5)

atb_style = WebUI.getAttribute(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/btnToggleBiayaPengiriman'), 'style')

println(atb_style)

if(atb_style == "display: inline;"){
	
	WebUI.click(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/btnToggleBiayaPengiriman'))
	
	WebUI.delay(5)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelDiscountInToggle'), 5)
	
	diskon = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelDiscountInToggle')).replaceAll("[^0-9]", "")
	
	println(diskon)
	
	WebUI.verifyEqual(diskon, GlobalVariable.txtBoxShippingDiscount)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelTotalFeeInToggle'), 5)
	
	totalfee = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelTotalFeeInToggle')).replaceAll("[^0-9]", "")
	
	println(totalfee)
	
	ongkir = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelBiayaPengiriman')).replaceAll("[^0-9]", "")
	
	println(ongkir)
	
	expongkir = totalfee.toInteger() - diskon.toInteger()
	
	WebUI.verifyEqual(ongkir, expongkir)
	
	subtotal = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelTotalHarga')).replaceAll("[^0-9]", "")
	
	println(subtotal)
	
	expsubtotal = hargaproduk.toInteger() + ongkir.toInteger()
	
	WebUI.verifyEqual(subtotal, expsubtotal)
}

else {

	WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblPromosiOngkosKirim'), 0)

	WebUI.verifyElementPresent(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelBiayaPengiriman'), 10)

	ongkir = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelBiayaPengiriman')).replaceAll("[^0-9]", "")

	WebUI.verifyEqual(ongkir, "0")
	
	total = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelTotalHarga')).replaceAll("[^0-9]", "")
	
	WebUI.verifyEqual(total, hargaproduk)

}