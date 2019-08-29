package com.mii
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import java.time.ZoneId;
import java.text.DateFormatSymbols
import java.time.LocalDate
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class AutoDatePicker {
	def driver = DriverFactory.getWebDriver()

	/**
	 * enter type startDate on start date datepicker and endDate on end date datepicker
	 */
	@Keyword
	def pickDate(TestObject to, String type) {
		WebElement element = WebUiBuiltInKeywords.findWebElement(to);
		element.click()

		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String month = localDate.getMonth().name();
		int day   = localDate.getDayOfMonth();
		if(type=="startDate"){
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}else if(type=="endDate"){
			month = localDate.plusDays(1).getMonth().name();
			day   = localDate.plusDays(1).getDayOfMonth();

			WebElement monthObject =(driver).findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/following::span[1]"));
			println "yang terlihat = "+monthObject.getText()

			if((monthObject.getText()).equalsIgnoreCase(month)){
				println "true"
			}else{
				WebElement nextObject =(driver).findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]"));
				Thread.sleep(1500);
				nextObject.click()
				println "klik next"
			}
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}
	}

	@Keyword
	def pickDateTab(String type) {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String month = localDate.getMonth().name();
		int day   = localDate.getDayOfMonth();
		if(type=="startDate"){
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}else if(type=="endDate"){
			month = localDate.plusDays(1).getMonth().name();
			day   = localDate.plusDays(1).getDayOfMonth();
			WebElement monthObject =(driver).findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/following::span[1]"));
			println "yang terlihat = "+monthObject.getText()
			if((monthObject.getText()).equalsIgnoreCase(month)){
				println "true"
			}else{
				WebElement nextObject =(driver).findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]"));
				Thread.sleep(1500);
				nextObject.click()
				println "klik next"
			}
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}
	}

	@Keyword
	def pickDateGaruda(TestObject to, String type) {
		WebElement element = WebUiBuiltInKeywords.findWebElement(to);
		element.click()

		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String month = localDate.getMonth().name();
		int day   = localDate.getDayOfMonth();
		if(type=="startDate"){
			WebElement dayObject =(driver).findElement(By.cssSelector(".ui-state-active"));
			Thread.sleep(1500);
			dayObject.click()
		}else if(type=="endDate"){
			month = localDate.plusDays(1).getMonth().name();
			day   = localDate.plusDays(1).getDayOfMonth();
			WebElement monthObject =(driver).findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Prev'])[1]/following::span[1]"));
			println "yang terlihat = "+monthObject.getText()

			if((monthObject.getText()).equalsIgnoreCase(month)){
				println "true"
			}else{
				WebElement nextObject =(driver).findElement(By.xpath("//a[@title = 'Next' and (text() = 'Next' or . = 'Next')]"));
				Thread.sleep(1500);
				nextObject.click()
				println "klik next"
			}
			WebElement dayObject =(driver).findElement(By.cssSelector(".ui-state-active"));
			Thread.sleep(1500);
			dayObject.click()
		}
	}

	@Keyword
	def pickDateDynamic(TestObject to, String type, Long daynext) {
		WebElement element = WebUiBuiltInKeywords.findWebElement(to);
		element.click()

		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String month = localDate.getMonth().name();
		int day   = localDate.getDayOfMonth();
		if(type=="startDate"){
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}else if(type=="endDate"){
			month = localDate.plusDays(daynext).getMonth().name();
			day   = localDate.plusDays(daynext).getDayOfMonth();

			WebElement monthObject =(driver).findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/following::span[1]"));
			println "yang terlihat = "+monthObject.getText()

			if((monthObject.getText()).equalsIgnoreCase(month)){
				println "true"
			}else{
				WebElement nextObject =(driver).findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]"));
				Thread.sleep(1500);
				nextObject.click()
				println "klik next"
			}
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}
	}

	@Keyword
	def pickDateDynamic_AdminCoupon(TestObject to, String type, Long daynext) {
		WebElement element = WebUiBuiltInKeywords.findWebElement(to);
		element.click()

		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String month = localDate.getMonth().name();
		int day   = localDate.getDayOfMonth();
		if(type=="startDate"){
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}else if(type=="endDate"){
			month = localDate.plusDays(daynext).getMonth().name();
			day   = localDate.plusDays(daynext).getDayOfMonth();

			WebElement monthObject =(driver).findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Prev'])[1]/following::select[2]"));

			int monthValue = Integer.parseInt(monthObject.getAttribute('value'))
			String monthObjectString = new DateFormatSymbols().getMonths()[monthValue]

			println "yang terlihat = "+ monthObjectString
			println "yang di drop down = "+month

			if((monthObjectString).equalsIgnoreCase(month)){
				println "true"
			}else{
				WebElement nextObject =(driver).findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]"));
				Thread.sleep(1500);
				nextObject.click()
				println "klik next"
			}
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}
	}

	@Keyword
	def pickDateDynamicStartDateEndDate(TestObject to, String type, Long daystart, Long daynext) {
		WebElement element = WebUiBuiltInKeywords.findWebElement(to);
		element.click()

		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String month = localDate.getMonth().name();
		int day   = localDate.getDayOfMonth();
		if(type=="startDate"){
			month = localDate.plusDays(daystart).getMonth().name();
			day   = localDate.plusDays(daystart).getDayOfMonth();

			WebElement monthObject =(driver).findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/following::span[1]"));
			println "yang terlihat = "+monthObject.getText()

			if((monthObject.getText()).equalsIgnoreCase(month)){
				println "true"
			}else{
				WebElement nextObject =(driver).findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]"));
				Thread.sleep(1500);
				nextObject.click()
				println "klik next"
			}
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}else if(type=="endDate"){
			daynext = daynext+daystart
			month = localDate.plusDays(daynext).getMonth().name();
			day   = localDate.plusDays(daynext).getDayOfMonth();

			WebElement monthObject =(driver).findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/following::span[1]"));
			println "yang terlihat = "+monthObject.getText()

			if((monthObject.getText()).equalsIgnoreCase(month)){
				println "true"
			}else{
				WebElement nextObject =(driver).findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]"));
				Thread.sleep(1500);
				nextObject.click()
				println "klik next"
			}
			WebElement dayObject =(driver).findElement(By.xpath("//a[@href = '#' and (text() = '"+day+"' or . = '"+day+"')]"));
			Thread.sleep(1500);
			dayObject.click()
		}
	}
}