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
import com.kms.katalon.core.logging.KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/lblTabPerusahaan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/txtboxNomorRekeningTokoUKM'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxNomorRekeningTokoUKM'), GlobalVariable.namaBelakangInputFieldMandatoryBuyer)

if (WebUI.verifyTextNotPresent(GlobalVariable.namaBelakangInputFieldMandatoryBuyer, false))
{
	log.logInfo("Nomor rekening hanya boleh diisi dengan angka 0 - 9")
}
else
{
	log.logInfo("Nomor Rekening Sesuai")
}
