import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\RONALD~1\\AppData\\Local\\Temp\\Katalon\\20190621_094145\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://github.com/login\')\n\nWebUI.setText(findTestObject(\'Page_Sign in to GitHub  GitHub/input_Username or email address_login\'), \'mnksiregar@gmail.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Sign in to GitHub  GitHub/input_Forgot password_password\'), \'S3slv/8K8+2hbKyc31qS0g==\')\n\nWebUI.click(findTestObject(\'Page_Sign in to GitHub  GitHub/input_Forgot password_commit\'))\n\nWebUI.click(findTestObject(\'Page_GitHub/span_Sign out_dropdown-caret\'))\n\nWebUI.click(findTestObject(\'Page_GitHub/summary_Sign out_Header-link\'))\n\nWebUI.click(findTestObject(\'Page_GitHub/span_testShopee\'))\n\nWebUI.click(findTestObject(\'Page_MonikaSiregartestShopee/a_Settings\'))\n\nWebUI.click(findTestObject(\'Page_Options/div_Edit\'))\n\nWebUI.click(findTestObject(\'Page_Options/label_Upload an image\'))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

