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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.bljstaging.com/')

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/i_BARU_icon bl-close'))

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/span_Masuk'))

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/input_Keluar_nick'), 
    'seller01:seller007')

WebUI.setEncryptedText(findTestObject('Object Repository/01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/input_Keluar_password'), 
    'mzHB2WV6gdc=')

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/a_Masuk'))

WebUI.click(findTestObject('Page_Toko WARUNGKAMI - BLANJA.com/a_WARUNGKAMI_closeDialog grey-'))

WebUI.click(findTestObject('Page_Toko WARUNGKAMI - BLANJA.com/a_Tampilkan Toko'))

