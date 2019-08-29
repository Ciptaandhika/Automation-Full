import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/lblProdukDipesan'), 
    2)

//WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddJasaPengirimanGoSend'), GlobalVariable.jasaPengirimanGOSEND)
WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/selectJasaPengiriman'), GlobalVariable.jasaPengirimanGOSEND, 
    GlobalVariable.choices)

WebUI.delay(2)

String cssvalue = WebUI.getCSSValue(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/popupEditPinPoint'), 'display')

println(cssvalue)

//if(WebUI.verifyElementAttributeValue(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/popupEditPinPoint'), 'style', 'display: block', 5, FailureHandling.OPTIONAL)){
//if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/popupEditPinPoint'), 5, FailureHandling.OPTIONAL)) {
//def myVal = WebUI.executeJavaScript('$("#district").find("option:selected").val()', [])
if (cssvalue == 'block') {
    Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//select[@name = \'district\']')))

    String optionLabel = select.getFirstSelectedOption().getText()

    println(optionLabel)

    //String myVal = WebUI.getNumberOfSelectedOption(findTestObject("01_DESKTOP/0104_Trade/010402_OrderConfirm/selectedKecamatan"))
    //.getText(findTestObject("01_DESKTOP/0104_Trade/010402_OrderConfirm/selectedKecamatan"))
    //println(myVal)
    WebUI.delay(2)

    WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/hrefCariAlamat'), 5)

    WebUI.delay(2)

    WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/hrefCariAlamat'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/EditAddress/txtAreaCariAlamat'), optionLabel)

    WebUI.delay(2)

    WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/div_KarangtengahCianjur'))

    WebUI.delay(2)

    WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnGunakanLokasi'))

    WebUI.delay(2)

    WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnSimpan'))

    WebUI.delay(2)

    WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddJasaPengirimanOrderConfirmPromo'), 
        GlobalVariable.jasaPengirimanGOSEND, GlobalVariable.choices)

    WebUI.delay(2)
}

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnLanjutkanPembayaran'))

