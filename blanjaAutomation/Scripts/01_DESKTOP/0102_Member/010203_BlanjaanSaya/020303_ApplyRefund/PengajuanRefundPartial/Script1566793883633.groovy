import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.locks.Condition

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver



WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/cbJenisRefund'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/txtBoxAlasaRefund'), 
    GlobalVariable.AlasanRefund)

String getrefund = GlobalVariable.txtHargaProdukSatuan

int refund = getrefund.toInteger() * 2

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020302_RefundDetail/txtJumlahRefund'), refund.toString())

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/txtBoxDeskripsiRefund'), GlobalVariable.DeskripsiRefund)

//WebUI.verifyElementNotVisible(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/btnBukti'))

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/btnUnggahBukti'))

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.JPGimage

//WebDriver driver = DriverFactory.getWebDriver()
//
//WebElement uploadelem = driver.findElement(By.name("trademarkMaterialFile"))
//
//uploadelem.sendKeys(Filepath)

//WebUI.modifyObjectProperty('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/objUploadFileUnggahBukti', "accept", ConditionType.EQUALS, "image/*", false)

WebUI.uploadFile(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/objUploadFileUnggahBukti'),
	Filepath)

//WebUI.sendKeys(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/objUploadFileUnggahBukti'),
//	Filepath)

//CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/btnUnggahBukti'),
//	Filepath)

WebUI.delay(10)

atbbukti = WebUI.getAttribute(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/objBuktiHapus'), "style")

WebUI.verifyNotEqual(atbbukti, "display: none;")

//WebUI.verifyElementVisible(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/btnBukti'))

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