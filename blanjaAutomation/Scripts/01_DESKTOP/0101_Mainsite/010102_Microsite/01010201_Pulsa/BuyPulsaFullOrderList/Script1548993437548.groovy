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

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/txtNoHandphone'), GlobalVariable.noHpTelkomsel)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/tableContent'), 0)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/Nominal/btn30k'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/btnBlanja'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/lableVABCA'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/btnKonfirmasi'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/btnLihatBlanjaanSaya'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/aCloseTCash'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/txtNamaProduk'), GlobalVariable.nameProductScheduler6)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/btnCari'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/lablePulsa30kBlanjaanSaya1'))

WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

linkProduct = WebUI.getUrl()

WebUI.verifyMatch(linkProduct, 'https://www.bljstaging.com/katalog/p/dgt/pulsa-30k-23341903', false)

