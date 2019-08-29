import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.urlMemberOrderListBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'), FailureHandling.OPTIONAL)

<<<<<<< HEAD
GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/LastOrderNumberBlanjaanSaya'))

GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('[^\\d]', '')
=======
//not_run: GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/LastOrderNumberBlanjaanSaya'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/txtboxOrderNumberBlanjaSaya'), 
    GlobalVariable.lastOrderNumberBlanjaanSaya)

//not_run: GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('[^\\d]', '')

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/btnCari'))
>>>>>>> Notification

//WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/verifyPembayaran'))
WebUI.verifyTextPresent('Pembayaran :BCA VA', false, FailureHandling.OPTIONAL)

WebUI.delay(5)
