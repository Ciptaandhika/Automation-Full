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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.navigateToUrl(GlobalVariable.URLlistProductSeller)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/txtBoxNamaProdukDijual'), 
    GlobalVariable.nameKopiBubuk)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/btnCariProdukDijual'))

//String xpath = '//*[@itemid="' + GlobalVariable.txtBoxProductId5 + '"]'
TestObject to = new TestObject('hrefOffSelfProductCreated')

to.addProperty('itemid', ConditionType.EQUALS, GlobalVariable.txtBoxProductId5)

WebUI.click(to)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/btnOKOffShelf'))

WebUI.delay(3)

WebUI.verifyTextPresent('success', false)

