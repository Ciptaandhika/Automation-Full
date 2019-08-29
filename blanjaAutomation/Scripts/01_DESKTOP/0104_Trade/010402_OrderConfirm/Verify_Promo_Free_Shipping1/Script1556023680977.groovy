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

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddOrderConfirmJasaPengiriman'), GlobalVariable.index1)

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnExpandOngkosKirim'), 
    60)

shippingFeeAmount = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblShippingFeeTotal')).replaceAll(
    '\\D+', '')

WebUI.delay(5)

discountAmount = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblDiscount')).replaceAll('\\D+', 
    '')

WebUI.delay(5)

buyerPaidAmount = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblBuyerPaid')).replaceAll('\\D+', 
    '')

WebUI.delay(5)

//println(shippingFeeAmount)
//println(discountAmount)
//println(buyerPaidAmount)
WebUI.comment('Shipping Fee')

log.logInfo(shippingFeeAmount.toString())

log.logInfo(discountAmount.toString())

log.logInfo(buyerPaidAmount.toString())

Integer.parseInt(buyerPaidAmount).equals(Integer.parseInt(shippingFeeAmount) - Integer.parseInt(discountAmount))

