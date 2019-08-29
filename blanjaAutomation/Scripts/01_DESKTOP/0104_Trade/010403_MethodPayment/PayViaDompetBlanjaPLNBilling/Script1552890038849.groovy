import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

GlobalVariable.getNoMeter = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Pulsa/lableNoMeter'))

GlobalVariable.getNominal = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/lableSubTotal'))

GlobalVariable.getNominal = GlobalVariable.getNominal.substring(3, 9).trim()

WebUI.delay(5)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/cbDompetBlanja'), 
    10)

//WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/cbDompetBlanja'))
WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/txtNominalDompetBlanja'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/txtNominalDompetBlanja'), GlobalVariable.getNominal)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/txtPasswordDompetBlanja'), FailureHandling.STOP_ON_FAILURE)

if(WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/lblVANotEnough'), 5, FailureHandling.OPTIONAL)){
	int currentTab = WebUI.getWindowIndex()
	
	WebDriver driver = DriverFactory.getWebDriver()
	
	JavascriptExecutor js = ((driver) as JavascriptExecutor)
	
	js.executeScript('window.open();')
	
	WebUI.switchToWindowIndex(currentTab + 1)
	
	WebUI.navigateToUrl(GlobalVariable.urlLoginAdminAdmin)
	
	WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/txtBoxUsernameAdmin'), GlobalVariable.usernameAdminMii)
	
	WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/txtBoxPasswordAdmin'), GlobalVariable.passwordAdminMii)
	
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/btnLoginAdmin'))
	
	WebUI.navigateToUrl(GlobalVariable.urlDompetBlanjaManagement)
	
	WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/txtBoxAccountName'), GlobalVariable.usernameBuyerLoginPayment)
	
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/btnSearchAccount'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/hrefEditOptionDompetBlanja'))
	
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/rbAddButton'))
	
	WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/txtBoxAddAmount'), GlobalVariable.saldoAdd100K)
	
	WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/txtAreaNoteAddAmount'), GlobalVariable.noteTambahkanSaldo)
	
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/btnConfirmAddAmount'))
	
	WebUI.acceptAlert()
	
	WebUI.switchToWindowIndex(currentTab)
	
	WebUI.delay(5)
	
	WebUI.click('01_DESKTOP/0104_Trade/010403_MethodPayment/btnOKVANotEnough')
	
	WebUI.refresh()
	
	CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/cbDompetBlanja'),
		10)
	
	//WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/cbDompetBlanja'))
	WebUI.delay(5)
	
	WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/txtNominalDompetBlanja'), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.delay(5)
	
	WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/txtNominalDompetBlanja'), GlobalVariable.getNominal)
	
	WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/txtPasswordDompetBlanja'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/txtPasswordDompetBlanja'), GlobalVariable.passwordDompetBlanja)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Pulsa/btnKonfirmasiPembayaran'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Pulsa/btnLihatTagihanSaya'))

