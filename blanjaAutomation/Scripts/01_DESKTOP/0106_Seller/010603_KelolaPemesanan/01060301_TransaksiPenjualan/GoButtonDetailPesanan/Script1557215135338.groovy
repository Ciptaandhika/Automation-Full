import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/hrefDetailPesanan'))

String url = WebUI.getUrl()

if (!url.contains('seller.bljstaging.com/trade/show')){
	KeywordUtil.markFailed("FAILED : URL doesn't contain expected string!")
}

