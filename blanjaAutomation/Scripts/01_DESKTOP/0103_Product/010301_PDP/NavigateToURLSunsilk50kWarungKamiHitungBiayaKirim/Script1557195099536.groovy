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
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl(GlobalVariable.URLProdukReguler50KMainsiteWarungKami)

try {
    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/close_dialog_gojek'))
}
catch (Exception e) {
} 

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('01_DESKTOP/0103_Product/010301_PDP/txtBoxQty'), Keys.chord(Keys.DELETE))

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/txtBoxQty'), '30')

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/divHitungBiayaKirim'))

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/divPilihKurir'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('01_DESKTOP/0103_Product/010301_PDP/liNinjaXpress'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/liNinjaXpress'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/divPilihLayanan'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('01_DESKTOP/0103_Product/010301_PDP/liReguler'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/liReguler'))

WebUI.delay(3)

WebUI.verifyTextPresent('Berat produk melebihi batas yang ditentukan oleh Ninja Ekspress yaitu 20 kg.', false)

