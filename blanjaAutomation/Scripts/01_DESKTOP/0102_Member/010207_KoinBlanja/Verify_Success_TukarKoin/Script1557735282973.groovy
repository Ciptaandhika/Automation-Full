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

earlyCoinBlanja = WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/lblSaldoCoinBlanja'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/btnTukarPoin'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/btnYaTukarPoin'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/lblNamaHadiahUndian'), 60)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/lblSuccessTukarPoin'), 60)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/btnLihatKuponUndianSuccess'), 60)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/btnXTukarHadiahUndian'))

WebUI.delay(3)

currentCoinBlanja = WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/lblSaldoCoinBlanja'))

if (WebUI.verifyNotEqual(earlyCoinBlanja, currentCoinBlanja)) {
    println(' Koin Berkurang')
} else {
    println('Koin Tidak Berkurang')
}

