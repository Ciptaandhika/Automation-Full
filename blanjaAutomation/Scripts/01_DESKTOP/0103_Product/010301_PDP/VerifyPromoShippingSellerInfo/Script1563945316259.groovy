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

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblPromoOngkosKirimBySeller'))

WebUI.delay(3)

WebUI.verifyTextPresent('Promo berlaku dari tanggal', false)

WebUI.verifyTextPresent('Minimum Transaksi', false)

WebUI.verifyTextPresent('Cover area pengiriman meliputi', false)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnCloseModal'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblHitungBiayaKirim'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblDikirimKe'))

WebUI.delay(3)

WebUI.clearText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/inputDaerahDikirimKe'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/inputDaerahDikirimKe'), GlobalVariable.provinsiDKIJakarta)

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/clickDKIJakarta'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/divPilihKurir'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblKurirStandar'))

WebUI.delay(3)

String biaya = WebUI.getText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblBiayaPengiriman')).substring(0, 4)

WebUI.verifyNotEqual(biaya, 'Rp 0')

