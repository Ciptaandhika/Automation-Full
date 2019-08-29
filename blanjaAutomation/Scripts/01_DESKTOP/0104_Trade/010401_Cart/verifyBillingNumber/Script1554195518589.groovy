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

try {
    WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnCloseTCash'), FailureHandling.OPTIONAL)
}
catch (Exception e) {
} 

GlobalVariable.lastBillingNumberBlanjaanSaya = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/PageTelkom/Page_Bayar Tagihan Telepon  Indihom/lblNoTagihan'))

GlobalVariable.lastBillingNumberBlanjaanSaya = GlobalVariable.lastBillingNumberBlanjaanSaya.substring(13)

//GlobalVariable.lastBillingNumberBlanjaanSaya = GlobalVariable.lastBillingNumberBlanjaanSaya.replaceAll('[^\\d]', '')
//noTagihan = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/PageTelkom/Page_Bayar Tagihan Telepon  Indihom/lblNoTagihan')).replaceAll(
//  '\\D+', '')
log.logInfo(GlobalVariable.lastBillingNumberBlanjaanSaya)

WebUI.closeBrowser()

