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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name (19)'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password (19)'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_btn_action (18)'))

WebUI.click(findTestObject('Page_Swag Labs/button_ADD TO CART (11)'))

WebUI.click(findTestObject('Page_Swag Labs/button_ADD TO CART (11)'))

WebUI.click(findTestObject('Page_Swag Labs/path (6)'))

WebUI.click(findTestObject('Page_Swag Labs/a_CHECKOUT (3)'))

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_first-name (2)'), 'dsadf')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_last-name (2)'), 'fdg')

WebUI.click(findTestObject('Page_Swag Labs/input_CANCEL_btn_primary cart_button (2)'))

