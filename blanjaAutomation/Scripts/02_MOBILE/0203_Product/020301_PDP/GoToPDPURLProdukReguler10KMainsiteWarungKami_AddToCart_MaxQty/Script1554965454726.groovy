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

WebUI.navigateToUrl(GlobalVariable.URLMWebProdukReguler5KMainsiteWarungKami)

WebUI.delay(5)

try {
    WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnCloseDialogGojek'), FailureHandling.OPTIONAL)
}
catch (Exception e) {
} 

WebUI.clearText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'))

WebUI.setText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'), GlobalVariable.qtyMaxProduct)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblJumlahQty'))

GlobalVariable.qtyProductMweb = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblPlusQtyButton'))

GlobalVariable.qtyProduct2Mweb = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'))

WebUI.verifyEqual(GlobalVariable.qtyProductMweb, GlobalVariable.qtyProduct2Mweb)

if (WebUI.verifyEqual(GlobalVariable.qtyProductMweb, GlobalVariable.qtyProduct2Mweb)) {
	println('buyer cant add item if they exceed the maximum limit')
}

