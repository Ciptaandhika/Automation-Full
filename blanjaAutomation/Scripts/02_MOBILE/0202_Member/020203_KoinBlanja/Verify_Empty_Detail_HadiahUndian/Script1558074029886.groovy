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

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/lblLainnyaHadiahLangsung'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Unidan Section/lblEmptyCoinDetailHadiahLangsung'), 
    30)

detailPrize1 = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/lblHadiahLangsungDetailKoin1'))

detailPrize2 = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/lblHadiahLangsungDetailKoin2'))

detailPrize3 = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/lblHadiahLangsungDetailKoin3'))

detailPrize4 = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/lblHadiahLangsungDetailKoin4'))

detailPrize5 = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/Hadiah Langsung Section/lblHadiahLangsungDetailKoin5'))

println(detailPrize1)

println(detailPrize2)

println(detailPrize3)

println(detailPrize4)

println(detailPrize5)

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020203_KoinBlanja/HadiahUndian/btnBlanjaSekarangDetailPrize'))

homeURL = WebUI.getUrl()

if (homeURL.contains('m.bljstaging')) {
    println('halaman homepage')
} else {
    println('Bukan Halaman homepage')
}

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/imgBlanjaHomepage'), 60)

