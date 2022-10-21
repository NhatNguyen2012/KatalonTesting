<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Sanity Checking</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>d3df459d-fdb9-49a9-82e2-1dca8b2602ae</testSuiteGuid>
   <testCaseLink>
      <guid>dab2cd2a-bc83-4809-a1c0-c43f75ecb2c2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data-Driven Testing/Login DDT</testCaseId>
      <testDataLink>
         <combinationType>MANY</combinationType>
         <id>dcb7f31f-edfa-40e9-b894-0a3cbf1cb54c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Another login informations</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>MANY</combinationType>
         <id>64f5fd6a-c8a5-4d92-a2b4-b683857f3af6</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 login informations</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>64f5fd6a-c8a5-4d92-a2b4-b683857f3af6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>DataUsername</value>
         <variableId>07b00acd-2301-43d5-9525-b15af4da9167</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dcb7f31f-edfa-40e9-b894-0a3cbf1cb54c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>DataPassword</value>
         <variableId>14af6809-c98a-4d07-9187-34f295ee0fe0</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
