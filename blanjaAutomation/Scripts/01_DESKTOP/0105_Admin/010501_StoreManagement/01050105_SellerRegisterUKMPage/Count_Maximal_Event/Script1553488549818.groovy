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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByTagName as ByTagName
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.WebElement as WebElement
import groovy.time.TimeCategory as TimeCategory


for (def index : (1..15)) {
    mydate = new Date()

    formattedDate = mydate.format('dd MMM ')

    datehour1 = mydate.format('HHmmss')

    datehour = mydate.format('HHmmssa')

    promotionDate = mydate.format('dd/MM/yyyy HH')

    use(TimeCategory, { 
            startMinutes = (mydate + 1.minutes)

            endMinutes = (mydate + 2.minutes)
        })

    newMinute = startMinutes.format('HHmmssa')

    endMinute = endMinutes.format('HHmmssa')

    site_id = ((GlobalVariable.registerUKMEvent + formattedDate) + datehour1)

    String site_id2 = site_id.replaceAll('\\s', '')

    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/btnCreateNewEvent'))

    WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxInputEventName'), 
        site_id2)

    WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxGeneratedURL'), 
        site_id2)

    CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEventStartDate'), 
        GlobalVariable.startDate)

    WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxStartTime'), 
        GlobalVariable.startTimeUKMEvent)

    CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEventEndDate'), 
        GlobalVariable.endDate)

    WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/txtboxEndTime'), 
        GlobalVariable.startTimeUKMEvent)

    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010501_StoreManagement/01050105_SellerRegisterUKMPage/btnCreateDetailEvent'))

    WebUI.verifyAlertPresent(0)

    WebUI.acceptAlert()
}

KeywordLogger log = new KeywordLogger()

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rowcount = rows_table.size()

int maxpagination = 15

if (rowcount >= maxpagination) {
    log.logInfo('jumlah maksimal baris ' + rowcount)
} else {
    log.logInfo('jumlah baris kurang dari' + maxpagination)
}

