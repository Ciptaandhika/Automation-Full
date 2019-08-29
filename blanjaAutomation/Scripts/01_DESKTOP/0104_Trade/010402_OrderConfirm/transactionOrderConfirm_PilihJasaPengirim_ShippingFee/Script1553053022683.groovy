import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.util.logging.Logger as Logger
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.orderByClause_scope as orderByClause_scope

KeywordLogger log = new KeywordLogger()

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/selectJasaPengiriman'), GlobalVariable.kurirStandarOrderConfirm, 
    false)

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ShippingFee/lblSpanBiayaPengiriman'))

hargaProduk = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ShippingFee/lblBiayaProduk')).replaceAll(
    '\\D+', '')

shippingFeeTotal = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ShippingFee/lblShippingFeeTotal')).replaceAll(
    '\\D+', '')

discountShippingFee = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ShippingFee/lblDiscountShippingFee')).replaceAll(
    '\\D+', '')

buyerPaid = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ShippingFee/lblBuyerPaid1')).replaceAll(
    '\\D+', '')

WebUI.comment('Shipping Fee')

log.logInfo(shippingFeeTotal.toString())

log.logInfo(discountShippingFee.toString())

log.logInfo(buyerPaid.toString())

Integer.parseInt(buyerPaid).equals(Integer.parseInt(shippingFeeTotal) - Integer.parseInt(discountShippingFee))

//idrTotalProdukOrderConfirm = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/labelTotalProdukRingkasanBelanja'))

//idrBiayaPengiriamanOrderConfirm = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/labelBiayaPengirimanRingkasanBelanja'))

//WebUI.click(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/LanjutkanPembayaran'))

