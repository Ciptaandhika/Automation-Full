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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

List<WebElement> objectLists = WebUI.findWebElements(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/divKuponUndianSayaAllRow'), 
    0)

//GlobalVariable.varTotalProductOrdered = objectLists.size()

Int total_kupon= 0

//WebUI.click(findTestObject('01_DESKTOP/0102_Member/010207_KoinBlanja/divKuponUndianSayaAllRow'))

KeywordLogger log = new KeywordLogger()

//log.logInfo(GlobalVariable.varTotalProductOrdered.toString())

for (WebElement eachlist : objectLists) {
	total_kupon++
	log.logInfo(total_kupon)
}

if(total_kupon == 5){
	log.logInfo('Kupon Ada Lima')
}
//    shopId = eachlist.getAttribute('shopid')
//
//    TestObject to = new TestObject()
//
//    to.addProperty('class', ConditionType.EQUALS, 'select-courier-provider column-12 p5')
//
//    to.addProperty('tag', ConditionType.EQUALS, 'select')
//
//    to.addProperty('shopid', ConditionType.EQUALS, shopId)
//
//    WebUI.selectOptionByLabel(to, findTestData('Payment/01_DESKTOP/0104_Trade/010402_OrderConfirm/orderConfirmData').getValue(
//            'kurirStandarOrderConfirm', 1), false)
//
//    log.logInfo(shopId)
//}

