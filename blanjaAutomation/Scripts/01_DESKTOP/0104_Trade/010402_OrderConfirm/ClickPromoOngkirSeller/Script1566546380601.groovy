import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/ddPromosiOngkir'), 1)

WebUI.delay(5)

Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath("//select[@class = 'coupon-input shop']")))

String optionLabel = select.getFirstSelectedOption().getText()

//opsi = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/ddPromosiOngkir'))

GlobalVariable.contentText = optionLabel

println(optionLabel)