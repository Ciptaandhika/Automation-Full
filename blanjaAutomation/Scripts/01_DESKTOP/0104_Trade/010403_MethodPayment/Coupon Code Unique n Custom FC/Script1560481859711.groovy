import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.List

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import codecLib.mpa.k
import internal.GlobalVariable as GlobalVariable

xpath1 = "/html/body/section[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div/div[2]"

TestObject object1 = new TestObject().addProperty("xpath", ConditionType.EQUALS, xpath1)

harga1awal = WebUI.getText(object1).replaceAll("[^0-9]", "")

println(harga1awal)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/txtCodeCoupon1'), GlobalVariable.CouponCodeUnique)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/btnGunakan1'), 
    0)

WebUI.verifyTextPresent("Anda mendapatkan potongan langsung sebesar Rp 30.000", false)

harga1akhir = WebUI.getText(object1).replaceAll("[^0-9]", "")

expharga1akhir = harga1awal.toInteger() - 30000

println(harga1akhir)

WebUI.verifyEqual(harga1akhir, expharga1akhir)


xpath2 = "/html/body/section[1]/div[1]/div[2]/div[1]/div[4]/div[3]/div/div[2]"

TestObject object2 = new TestObject().addProperty("xpath", ConditionType.EQUALS, xpath2)

harga2awal = WebUI.getText(object2).replaceAll("[^0-9]", "")

println(harga2awal)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/txtCodeCoupon2'), GlobalVariable.couponCode)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/btnGunakan2'), 
    0)

WebUI.verifyTextPresent("Anda mendapatkan potongan langsung sebesar Rp 20.000", false)

harga2akhir = WebUI.getText(object2).replaceAll("[^0-9]", "")

expharga2akhir = harga2awal.toInteger() - 20000

println(harga2akhir)

WebUI.verifyEqual(harga2akhir, expharga2akhir)

int total = harga1akhir.toInteger() + harga2akhir.toInteger()

kuponterpakai = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/CouponVoucher/lblKuponBlanja')).replaceAll("[^0-9]", "")

WebUI.verifyEqual(kuponterpakai, "50000")

totalharga = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalAmountPayment')).replaceAll("[^0-9]", "")

WebUI.verifyEqual(totalharga, total)