package com.huunhat.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import java.time.ZoneOffset
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import com.kms.katalon.core.configuration.RunConfiguration

public class screenshotConvention {
	private static ZoneOffset myZoneOffset = ZoneOffset.of("+7")
	private static DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy-HH.mm.ss")

	@Keyword
	def takeScreenshotFormat(String path) {
		LocalDateTime now = LocalDateTime.now(myZoneOffset)
		
		String dateTime = dtFormatter.format(now)
		//String TCName = RunConfiguration.getExecutionSource().toString().substring(RunConfiguration.getExecutionSource().toString().lastIndexOf("\\")+1)
		String completePath = path + GlobalVariable.testCaseName + '-' + dateTime + ".png"

		WebUI.takeScreenshot(completePath)
	}
}
