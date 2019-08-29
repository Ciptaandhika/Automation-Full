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
import java.time.LocalDate as LocalDate
import org.openqa.selenium.WebElement as WebElement
import groovy.time.TimeCategory as TimeCategory
import java.util.Calendar as Calendar
import java.util.Date as Date
import java.util.GregorianCalendar as GregorianCalendar
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.navigateToUrl(GlobalVariable.urlOrderManagementOrderManagement)

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxOrderNumber'), 
    GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSearch'))

GlobalVariable.PaymentCodeOrderManagement = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/GetPaymentCode'))

GlobalVariable.PaymentCodeOrderManagement = GlobalVariable.PaymentCodeOrderManagement.substring(14, 27).trim()

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/hrefChangeLogisticAdmin'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxChangeLogisticAwb'), 
    0)

String mynumber = GlobalVariable.nomorResiJneRandomBilly

int mylength = mynumber.length()

String submynumber = mynumber.substring(0, mylength - 8)

mydate = new Date()

use(TimeCategory, { 
        endMin = (mydate - 1.days)
    })

newMinusDate = endMin.format('ddMM')

//LocalDate a = LocalDate.now()
//LocalDate b = LocalDate.now()
/*minusDate = formattedDate.minusDays(2)*/
/*minusDate = formattedDate*/
//Calendar formattedDate = Calendar.getInstance();
//formattedDate.add(Calendar.DATE, -1)
//newFormat = a.minusDays(1)
//newFormat2 = b.minusMonth(1)
datehour = mydate.format('HHmm')

String adminresi_newcharacter = (submynumber + newMinusDate) + datehour

String adminnewresi = adminresi_newcharacter.replaceAll('\\s+', '')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxChangeLogisticAwb'), 
    adminnewresi)

WebUI.delay(4)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/btnOKLogistic'))

