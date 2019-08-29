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

WebUI.navigateToUrl(GlobalVariable.URLProdukRegular5KMainsite)

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnExpressGoSend'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnGoSend'))

    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnChatPenjual'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/txtareaMessageToSeller'), GlobalVariable.msgHalo)

    WebUI.click(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/btnSendBuyer'))

    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010302_Store/btnCloseStoreTokoKami'))

    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnChatPenjual'))

    WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/btnSendBuyer'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblDetailMessageProductPanteneBlackShine'), 
        30)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010301_PDP/hrefDetailMessageWarungKita'), 30)
} else {
    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnChatPenjual'))

    WebUI.delay(3)

    WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/txtareaMessageToSeller'), GlobalVariable.msgHalo)

    WebUI.click(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/btnSendBuyer'))

    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010302_Store/btnCloseStoreTokoKami'))

    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnChatPenjual'))

    WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0102_Member/010205_KotakMasuk/btnSendBuyer'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010301_PDP/lblDetailMessageProductPanteneBlackShine'), 
        30)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010301_PDP/hrefDetailMessageWarungKita'), 30)
}

