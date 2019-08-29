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

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Jual Sunsilk Hijab Botol  BLAN/klik_hitung_biaya_kirim'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Jual Sunsilk Hijab Botol  BLAN/klik_pilih_kurir'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Jual Sunsilk Hijab Botol  BLAN/ninja_xpress'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Jual Sunsilk Hijab Botol  BLAN/ninja_xpress'))

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/HomePageFerina/btn_pilihlayanan'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/HomePageFerina/layanan_reguler'), 0)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/HomePageFerina/layanan_reguler'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/HomePageFerina/label_biayakirim'), 0)

