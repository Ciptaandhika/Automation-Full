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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtNoKTP'), GlobalVariable.namaAttributeNama)

String noktp1 = WebUI.getAttribute(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtNoKTP'), 'value')

log.logInfo(noktp1.toString())

WebUI.verifyMatch(noktp1, '', false)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtNoKTP'), GlobalVariable.idNoKtp)

String noktp2 = WebUI.getAttribute(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtNoKTP'), 'value')

log.logInfo(noktp2.toString())

WebUI.verifyMatch(noktp2, GlobalVariable.idNoKtp, false)

