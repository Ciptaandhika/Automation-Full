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

WebUI.navigateToUrl('http://admin.bljstaging.com/login?redirectURL=http%253A%252F%252Fadmin.bljstaging.com%252FbrandList%252Fsetting%252Findex#nogo')

WebUI.setText(findTestObject('Page_/input_Account Name_nick'), 'miiadmin')

WebUI.setEncryptedText(findTestObject('Page_/input_Password_password'), 'mzHB2WV6gdc=')

WebUI.click(findTestObject('Page_/input_Password_saveBtn'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_SEO text'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/h1_TEST UPDATE'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/input_SEO_OFFICIAL_BRAND_saveS'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_Footer Blanja'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_Footer Blanja'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_List Brand'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_SEO text'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/strong_TEST UPDATE'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/strong_UPDATE'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/input_SEO_OFFICIAL_BRAND_saveS'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_Header Blanja'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_Banner setting'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_List Brand'))

WebUI.click(findTestObject('Page_Brand List - BLANJA.com/a_Promo Section'))

