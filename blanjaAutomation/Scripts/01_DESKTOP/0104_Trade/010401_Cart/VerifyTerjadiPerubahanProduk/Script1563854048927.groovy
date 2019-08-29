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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/lblTerjadiPerubahanProduk'), 5)

String text = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/lblTerjadiPerubahanProduk'), FailureHandling.STOP_ON_FAILURE)

if (!(text.contains('Terjadi perubahan pada Produk'))) {
    KeywordUtil.markFailed('FAILED : Tulisan pada PopUp tidak sesuai')
}

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/btnOKTerjadiPerubahanProduk'))

WebUI.verifyTextPresent('Troli Blanja kamu masih kosong.', false)

