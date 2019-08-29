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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050925_BQodeCampaign/Page_/txtBoxScanLimit'), 
    GlobalVariable.DuaEnam)

String Projectpath1 = System.getProperty('user.dir')

String Filepath1 = Projectpath1 + GlobalVariable.qode1280jpg

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050925_BQodeCampaign/Page_/uploadPromoScreenImage'), 
    Filepath1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050925_BQodeCampaign/Page_/txtBoxPromoScreenUrl'), 
    GlobalVariable.urlProductGoSend)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050925_BQodeCampaign/Page_/txtBoxPromoScreenLabel'), 
    GlobalVariable.input35Karakter)

String karakter = GlobalVariable.input35Karakter

	mychar = karakter.length()

	String label = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050925_BQodeCampaign/Page_/txtBoxPromoScreenLabel'), 'value')

	mychar2 = label.length()

	int maxcharacter = 30

	if (mychar > maxcharacter) {
		log.logInfo('karakter yang di inputkan ' + mychar)

		log.logInfo('karakter maksimum yang ada di text box ' + mychar2)
	}
	
	WebUI.delay(3)

