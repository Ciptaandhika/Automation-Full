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

WebUI.navigateToUrl(GlobalVariable.urlProductInstallment)

GlobalVariable.qtymaxbarang = WebUI.getText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Product Page/lblMaxQty'))

String abcd = GlobalVariable.qtymaxbarang

GlobalVariable.qtymaxbarang = abcd.substring(0, 5)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Product Page/txtBoxQtyProduct'), GlobalVariable.qtymaxbarang)

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnGoSend'), 
    2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnGoSend'), 
        FailureHandling.OPTIONAL)
} else {
}

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnTambahkanKeTroli'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/lblBerhasilDitambahkan'), 
    30)

