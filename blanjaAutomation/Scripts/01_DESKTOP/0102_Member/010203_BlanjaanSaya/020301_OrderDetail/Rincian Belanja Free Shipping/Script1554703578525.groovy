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

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Page_Blanjaan Saya - BLANJA.com/href_RincianBlanjaanP'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Page_Blanjaan Saya - BLANJA.com/div_(Promo Shipping)'), 
    30)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Page_Blanjaan Saya - BLANJA.com/div_(Promo Shipping)'),
	30)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/hrefDetailFreeShipping'), 5, FailureHandling.STOP_ON_FAILURE)){

	WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/hrefDetailFreeShipping'))
	
	WebUI.delay(3)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelShippingFeeTotalInDetailToggle'), 5)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelDiscountInDetailToggle'), 5)
	
	totalongkir = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelShippingFeeTotalInDetailToggle')).replaceAll("[^0-9]", "")
	
	diskon = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelDiscountInDetailToggle')).replaceAll("[^0-9]", "")
	
	bayarongkir = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelShippingFee')).replaceAll("[^0-9]", "")
	
	expongkir = totalongkir.toInteger() - diskon.toInteger()
	
	WebUI.verifyEqual(bayarongkir, expongkir)
	
	hargaperunit = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelHargaPerUnit')).replaceAll("[^0-9]", "")
	
	jumlahunit = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelJumlah'))
	
	totalpemesanan = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelTotalPemesanan')).replaceAll("[^0-9]", "")
	
	exptotalpemesanan = hargaperunit.toInteger() * jumlahunit.toInteger() + bayarongkir.toInteger()
	
	WebUI.verifyEqual(totalpemesanan, exptotalpemesanan)
	
}
