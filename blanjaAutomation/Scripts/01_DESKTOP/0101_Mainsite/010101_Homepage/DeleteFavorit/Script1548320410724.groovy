import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.concurrent.ConcurrentSkipListMap.KeySet as KeySet
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

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/lbltest01'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010204_Favorit/HrefFavorit'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/BuyerOrderListPage/hrefOKTcash'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010204_Favorit/cbHapus_favoriteItemId'))

not_run: WebUI.click(findTestObject('01_DESKTOP/0102_Member/010204_Favorit/HrefHapus'))

WebUI.acceptAlert()

WebUI.sendKeys(findTestObject('01_DESKTOP/0102_Member/010204_Favorit/HrefHapus'), Keys.chord(Keys.TAB, Keys.ENTER))

