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

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/ddType'), 
    GlobalVariable.ddValueIndihome)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/txtProductName'), 
    GlobalVariable.nmIndiHome)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/txtShopId'), 
    GlobalVariable.idShop)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/txtInformation'), 
    GlobalVariable.nmIndiHomeINFO)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.qode50kb

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/btnUpload'), 
    Filepath)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/rbOnShelf'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/btnSubmit'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/btnOK'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/btnClose'))

WebUI.verifyTextPresent(GlobalVariable.nmIndiHome, false)

