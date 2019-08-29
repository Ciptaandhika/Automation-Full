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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/BuyerOrderListPage/hrefOKTcash'), 
    2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/BuyerOrderListPage/hrefOKTcash'), 
        FailureHandling.OPTIONAL)
} else {
}

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/labelHadiahUndian'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/labelHadiahUndian'), 3)

WebUI.delay(3)

