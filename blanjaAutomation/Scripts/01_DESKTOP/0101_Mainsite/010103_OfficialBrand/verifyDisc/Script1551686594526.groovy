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

//KeywordLogger log = new KeywordLogger()
//price3 = WebUI.get(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Flash sale - BLANJA.com/p_Rp35.600'))
//log.logInfo(price3)
//WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Flash sale - BLANJA.com/p_Rp35.600'), 
//0)
ribbonDisc = WebUI.getText(findTestObject('01_DESKTOP/0101_Mainsite/010103_OfficialBrand/Page_Jual Moment Watch Teiwe Collec/ribbonDiscRedd'))

String ribbonDisc2 = GlobalVariable.ribbonDiscPromo

println('disc PDP' + ribbonDisc)

println('disc promo' + ribbonDisc2)

WebUI.verifyEqual(ribbonDisc, ribbonDisc2)

