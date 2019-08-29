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

SuccesURL = WebUI.getUrl()

SuccesURL.contains('finpay.finnet-indonesia.com')

//Amount = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalAmountPayment')).replaceAll('[^0-9]', '')

//Ambiltext = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010404_ThankYouPage/FinPay/Alfamart/txtDetilPembayaran')).split('.')[1]

Ambiltext = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010404_ThankYouPage/FinPay/Alfamart/txtDetilPembayaran')).split("\\.")

println(Ambiltext)

println(Ambiltext[1])

Amount = Ambiltext[1].replaceAll('[^0-9]', '')

println(Amount)

WebUI.verifyEqual(Amount, GlobalVariable.getTotalAmount)	

WebUI.verifyTextPresent("Kode pembayaran anda adalah", false)