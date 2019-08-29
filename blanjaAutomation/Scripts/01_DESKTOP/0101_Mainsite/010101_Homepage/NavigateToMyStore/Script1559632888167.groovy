import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.urlSeller)

if(WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/imgPopUpInfo'), 0) ){
	WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClosePopUpInfo'))
}

String BufferURL = WebUI.getUrl()

WebUI.verifyEqual(BufferURL, GlobalVariable.urlSeller)
