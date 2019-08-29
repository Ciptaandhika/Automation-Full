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

WebUI.click(findTestObject('02_MOBILE/0203_Product/020302_Store/btnGantiAlamatPengambilan'))

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxProvinsi'), 1)

provinsi = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxProvinsi'))

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxKota'), 1)

kota = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxKota'))

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxKecamatan'), 6)

kecamatan = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxKecamatan'))

println(provinsi)

println(kota)

println(kecamatan)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/lblPickUpLocation'))

pickUpLocation = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/lblDisplayPickUpLocation'))

println(pickUpLocation)

