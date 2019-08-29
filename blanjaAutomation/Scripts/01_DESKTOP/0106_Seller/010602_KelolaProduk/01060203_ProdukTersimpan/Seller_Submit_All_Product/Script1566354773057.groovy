import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

while (WebUI.verifyTextPresent("Submit", false, FailureHandling.OPTIONAL)){
	
	WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060203_ProdukTersimpan/btnSubmitProdukTersimpan'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060203_ProdukTersimpan/btnSubmitOk'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060203_ProdukTersimpan/btnSubmitOkSukses'))
	
	WebUI.delay(5)
	
	WebUI.refresh()

	WebUI.delay(5)
	
}
