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

not_run: WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Page_Koin Blanja - BLANJA.com/btnLihatKuponSaya'))

not_run: WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/KuponHadiahLangsung/btn_KuponHadiahLangsung'))

not_run: WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Page_Koin Blanja - BLANJA.com/btnTukarKoinHadiahLangsung'))

WebUI.scrollToElement(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Page_Koin Blanja - BLANJA.com/labelHadiahLangsung'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Page_Koin Blanja - BLANJA.com/btnTukarLangsung'))

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Page_Koin Blanja - BLANJA.com/button_Yalangsung'))

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Page_Koin Blanja - BLANJA.com/buttonLihatHadiahlangsung'))

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Page_Koin Blanja - BLANJA.com/button_GunakanHlangsung'))

WebUI.verifyTextPresent('Syarat & Ketentuan', true)

