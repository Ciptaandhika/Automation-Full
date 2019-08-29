import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.urlMemberOrderListBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'))

GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('\\D+', '')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/txtboxNomorOrder'), GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnCari'))

//WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/verifyPembayaran'))
WebUI.verifyTextPresent('Pembayaran :Finpay 021 Channel - Indomaret', false)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/hrefBatalkanBlanjaan'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/txtBoxAlasanPembatalan'), 'Reason_A', 
    false)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020304_BatalkanBlanjaan/btnOkBatalkanBlanjaan'))

WebUI.verifyElementText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020304_BatalkanBlanjaan/div_StatusBlanjaanTutup'), 
    'Tutup')

