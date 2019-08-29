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
import java.text.DateFormatSymbols
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.text.DateFormat as DateFormat
import java.text.DateFormat
import java.text.Format
import java.time.LocalDate
import java.time.format.DateTimeFormatter

WebUI.openBrowser('')

DateFormatSymbols symbols = new DateFormatSymbols(new Locale("id"));
// for the current Locale :
//   DateFormatSymbols symbols = new DateFormatSymbols(); 
//String[] dayNames = symbols.getWeekdays();
//for (String s : dayNames) { 
   //println(s + " ");
//}

//String datee = symbols.

//Format dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy")
//String res = dateFormat.format(new Date())
//println(res)

LocalDate localDate=LocalDate.of(2016,01,01);

Locale spanishLocale=new Locale("id", "ID");
String dateInSpanish=localDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy",spanishLocale));
System.out.println("'2016-01-01' in Spanish: "+dateInSpanish);
