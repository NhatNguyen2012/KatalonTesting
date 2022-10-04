import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://intranet.tma.com.vn/')

//WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login page/input_fieldByText', ['text' : 'username']), GlobalVariable.MapCredentials.get('Username'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login page/input_fieldByText', ['text' : 'password']), GlobalVariable.MapCredentials.get('Password'))

WebUI.click(findTestObject('Object Repository/Login page/btn_login'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Home page/icon_profile'), 10)

WebUI.scrollToElement(findTestObject('Object Repository/Home page/gallery'), 3)

WebUI.takeFullPageScreenshot("D:\\full-view.png")

WebUI.mouseOver(findTestObject('Object Repository/Home page/ddl_tools'))

WebUI.click(findTestObject('Object Repository/Home page/item_employeeContact'))

//WebUI.submit(findTestObject('')) => có thể làm với cái này?

WebUI.switchToWindowIndex(1)
//WebUI.waitForElementPresent(findTestObject('Object Repository/HRM Tool page/ddl_filter'), 5, FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/HRM Tool page/ddl_filter'), 'Badge ID', false)

WebUI.setText(findTestObject('Object Repository/Login page/input_fieldByText', ['text' : 'values_emp_fullname']), 'Bình')

//WebUI.setText(findTestObject('Object Repository/Login page/input_fieldByText', ['text' : 'values_employee_id']), '122980')

WebUI.click(findTestObject('Object Repository/Login page/input_fieldByText', ['text' : 'searchBtn']))

CustomKeywords.'com.huunhat.utilities.CommonUtilities.loopThroughTable'(findTestObject('Object Repository/HRM Tool page/table_result'))

WebUI.closeWindowIndex(1)



//WebUI.closeBrowser()





