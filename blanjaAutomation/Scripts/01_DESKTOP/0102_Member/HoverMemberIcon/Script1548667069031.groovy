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

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/lbltest01'))

WebUI.mouseOver(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/HrefDompetBlanja'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/hrefInformasiAkun'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/HrefBlanjaanSaya'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('01_DESKTOP/0102_Member/HrefTagihanSaya'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('01_DESKTOP/0102_Member/010204_Favorit/HrefFavorit'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/HrefKotakMasuk'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('01_DESKTOP/0102_Member/010206_Ulasan/HrefUlasan'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/LiveReport_Tanya/HrefMyeBay'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('01_DESKTOP/0102_Member/HrefKeluar'))

