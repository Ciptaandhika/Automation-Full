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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.navigateToUrl(GlobalVariable.URLProdukKalimantan10KWarungKita)

not_run: if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnXGoSend'), 2, FailureHandling.OPTIONAL)) {
    not_run: WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnXGoSend'))
} else {
}

WebUI.clearText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/txtBoxQty'))

WebUI.setText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/txtBoxQty'), GlobalVariable.qtySold)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnBlanjaSekarang'))

