import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


xpath1 = "/html/body/section[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div/div[2]"

TestObject object1 = new TestObject().addProperty("xpath", ConditionType.EQUALS, xpath1)

harga1awal = WebUI.getText(object1).replaceAll("[^0-9]", "")

println(harga1awal)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/txtBoxMasukkanKodeVoucherCashback'), 
    GlobalVariable.CouponCodeUnique)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/btn_Gunakan'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/lblPotonganSebesar20000'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/lbl_Rp75.000'), 30)

potensi = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/lblPotonganSebesar20000'))

WebUI.verifyEqual(potensi, "Anda mendapatkan potensi cashback hingga Rp 20.000")

harga1akhir = WebUI.getText(object1).replaceAll("[^0-9]", "")

println(harga1akhir)

WebUI.verifyEqual(harga1akhir, harga1awal)

totalharga = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalAmountPayment')).replaceAll("[^0-9]", "")

WebUI.verifyEqual(totalharga, harga1akhir)