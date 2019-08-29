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


KeywordLogger log = new KeywordLogger()



if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lblTypeStorePerorangan'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}


if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreOwnerName'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreNoHandphone'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreNamaToko'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreDomainToko'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreDeskripsiToko'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreAlamatToko'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}


if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreLogoToko'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreProvinsi'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreKabupaten'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreKecamatan'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}

if (WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreKodePos'), GlobalVariable.storeName, FailureHandling.OPTIONAL)) {
	log.logInfo('Elemen Bukan Label')
} else {
	log.logInfo('Elemen Label')
}



