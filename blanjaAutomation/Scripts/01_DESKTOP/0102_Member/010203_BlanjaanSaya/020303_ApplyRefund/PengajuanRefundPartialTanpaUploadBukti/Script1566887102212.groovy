import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/cbJenisRefund'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/txtBoxAlasaRefund'), 
    GlobalVariable.AlasanRefund)

String getrefund = GlobalVariable.txtHargaProdukSatuan

int refund = getrefund.toInteger() * 2

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020302_RefundDetail/txtJumlahRefund'), refund.toString())

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/txtBoxDeskripsiRefund'), GlobalVariable.DeskripsiRefund)

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/btnSubmitRefund'))

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/btnKonfirmasiRefund'))

WebUI.delay(30)

//GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020302_RefundDetail/hrefNomorPemesanan'))

//GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('[^\\d]', '')

refundberhasil = WebUI.getUrl()

if (!refundberhasil.contains("/refund/show")){
	
	KeywordUtil.markFailed("URL Refund berhasil tidak sesuai!")
	
}