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

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/sliderCashback'))

WebUI.clearText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/txtBoxCashbackNominal'))

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/txtBoxCashbackNominal'), GlobalVariable.nominalCashbackForPartialPayment)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/sliderDompetBlanja'))

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/txtBoxDompetBlanjaSaldo'), GlobalVariable.nominalDompetBlanjaForPartialPayment)

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblDompetBlanjaPassword'), GlobalVariable.PasswordDompetBlanja)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BNI/BNI_Kartu_Kredit/rbBNIKartuKredit'))

//WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BNI/BNI_Kartu_Kredit/selectPromotionBankCard'),   1)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

WebUI.delay(10)

