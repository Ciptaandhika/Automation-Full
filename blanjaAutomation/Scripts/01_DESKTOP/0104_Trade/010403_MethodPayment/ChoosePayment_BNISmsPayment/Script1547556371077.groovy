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

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BNI/BNI_SMS_Payment/rb_BNI_SMSPayment'))

WebUI.verifyElementAttributeValue(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BNI/BNI_SMS_Payment/label_CountryCode'), 
    'placeholder', '+62', 0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BNI/BNI_SMS_Payment/txtBox_MasukkanNoHPSMSPayment'), 
    0)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BNI/BNI_SMS_Payment/txtBox_MasukkanNoHPSMSPayment'), 
    GlobalVariable.bniSmsPaymentPhoneNumber)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

