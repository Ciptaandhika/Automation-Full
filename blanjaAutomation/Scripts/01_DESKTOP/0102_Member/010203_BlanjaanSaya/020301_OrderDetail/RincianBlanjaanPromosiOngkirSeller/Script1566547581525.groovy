import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Page_Blanjaan Saya - BLANJA.com/href_RincianBlanjaanP'))

WebUI.switchToWindowIndex(1)

promotext = "Promo Seller(" + GlobalVariable.contentText + ")"

actualText = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelPromoOngkirSeller')).replaceAll('\\n', "")

println(actualText)

WebUI.verifyEqual(actualText, promotext)

//if (WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelPromoOngkirSeller')).contains(promotext)){
//	
//	KeywordUtil.markPassed("Promo Ongkir Seller ada di page")
//	
//}
//
//else{
//	KeywordUtil.markFailed("PROMO ONGKIR SELLER TIDAK TAMPIL DI PAGE")
//}