import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
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

endTime = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/inputCampaignTimeEnd'), 
    'value').substring(0, 2)

//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy")
//LocalDate dateEndTime = LocalDate.parse(endTime, formatter)
SimpleDateFormat dateFormat = new SimpleDateFormat('dd')

Date date = new Date()

todayTime = dateFormat.format(date)

datePlusBefore = ((new Integer(endTime) - new Integer(todayTime)) + 1)

datePlus = Long.parseLong(datePlusBefore.toString())

println(endTime)

println(todayTime)

println(datePlus.toString())

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/inputCampaignTimeExtend'), 
    'startDate', datePlus, 0)

WebUI.delay(5)

