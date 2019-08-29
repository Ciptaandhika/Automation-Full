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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/PageGaruda/txtBoxDariGaruda'), 
    'Pekanbaru')

not_run: WebUI.delay(2)

not_run: WebUI.sendKeys(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/PageGaruda/txtBoxDariGaruda'), 
    Keys.chord(Keys.DOWN, Keys.ENTER))

not_run: WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/PageGaruda/txtBoxKeGaruda'), 
    findTestData('PRODUK_DIGITAL/01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/PageGaruda(SekaliJalan)').getValue(
        'Ke', 1))

not_run: WebUI.delay(2)

not_run: WebUI.sendKeys(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/PageGaruda/txtBoxKeGaruda'), 
    Keys.chord(Keys.DOWN, Keys.ENTER))

