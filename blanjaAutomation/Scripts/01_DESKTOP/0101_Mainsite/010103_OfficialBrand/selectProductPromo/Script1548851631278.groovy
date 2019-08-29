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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebDriver driver = DriverFactory.getWebDriver()

WebElement element = driver.findElement(By.xpath("//div[@class='promo-wrapper all-product clearfix']"))
List<WebElement> div = element.findElements(By.xpath("div[@class='product']"))


WebElement divDetail = div.get(0).findElement(By.className('detail'))
List<WebElement> divPrice = divDetail.findElements(By.tagName("div"))
WebElement spanDisc = div.get(0).findElement(By.className('discount'))
GlobalVariable.priceProductPromo = divPrice.get(1)findElement(By.tagName("p")).getText()
//GlobalVariable.priceProductPromo = divDetail.findElement(By.tagName("p")).getText()
GlobalVariable.ribbonDiscPromo = spanDisc.getText()

println("promo price" + GlobalVariable.priceProductPromo )
println("promo disc" + GlobalVariable.ribbonDiscPromo )

div.get(0).findElement(By.tagName("a")).click()

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnGoSend'),
	2, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnGoSend'),
		FailureHandling.OPTIONAL)
} else {
}

//println(div.size())

//List<WebElement> div2 = element.findElements(By.className("product"))
//println(div2.size())

//WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010103_OfficialBrand/Page_Flash sale - BLANJA.com/h3_Sleek Foamy Hand Wash Shoot'))

