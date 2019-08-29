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

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefBlogResmi'))

url1 = WebUI.getUrl()

WebUI.verifyEqual(url1, GlobalVariable.urlBlogResmi)

WebUI.back()

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefPerjanjianPengguna'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefPerjanjianPengguna'))

url2 = WebUI.getUrl()

WebUI.verifyEqual(url2, GlobalVariable.urlPerjanjianPengguna)

WebUI.back()

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefKebijakanPrivasi'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefKebijakanPrivasi'))

url3 = WebUI.getUrl()

WebUI.verifyEqual(url3, GlobalVariable.urlKebijakanPrivasi)

WebUI.back()

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefSyaratKetentuan'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefSyaratKetentuan'))

url4 = WebUI.getUrl()

WebUI.verifyEqual(url4, GlobalVariable.urlSyaratKetentuan)

WebUI.back()

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefFAQ'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefFAQ'))

url5 = WebUI.getUrl()

WebUI.verifyEqual(url5, GlobalVariable.urlFAQ)

