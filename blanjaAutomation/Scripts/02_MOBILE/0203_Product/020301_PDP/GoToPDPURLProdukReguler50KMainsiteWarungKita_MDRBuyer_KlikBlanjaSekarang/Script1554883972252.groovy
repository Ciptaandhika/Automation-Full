import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

WebUI.navigateToUrl(GlobalVariable.URLMWebProdukReguler50kMDRBuyer)

WebUI.delay(2)

try {
    WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnCloseDialogGojek'), FailureHandling.OPTIONAL)
}
catch (Exception e) {
} 

WebUI.setText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'), '2')

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnSimulasiCicilanMulaiDari'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0203_Product/020301_PDP/divInstallmentPayment'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnXSimulasiCicilan'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnBlanjaSekarang'))

WebUI.delay(5)

