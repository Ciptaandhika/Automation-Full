import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

mydate = new Date()

String month_now = mydate.format('MM')

String day = mydate.format('dd')

String year = mydate.format('yyyy')

int int_month_yes = month_now.toInteger() - 1

String month_yes

if (int_month_yes < 10) {
	month_yes = "0" + int_month_yes.toString()
}
else {
	month_yes = int_month_yes.toString()
}

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/aBillingTransaction'))

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/btnExport'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/btnExport'))

WebUI.delay(5)

String home = System.getProperty('user.home')

println(home)

String filename = ((((((((((('OrderBilling ' + day) + '_') + month_yes) + '_') + year) + ' _ ') + day) + '_') + month_now) + 
'_') + year) + '.xlsx'

println(filename)

File dir = new File(home + '/Downloads/' + filename)

println(dir)

if (dir.exists()) {
	println('File is exist')
}


//if (Files.exists(Paths.get(dir))) {
//    println('File is exist')
//}

