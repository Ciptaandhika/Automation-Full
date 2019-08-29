<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>1. Dari halaman penarikan dana, klik penarikan dana
2. Lakukan proses withdrawal sampai halaman submit withdrawal

1. User berhasil melakukan withdrawal
2. Amount yang di withdrawal harus sama dengan balance yang dimiliki oleh user
Amount withdrawal = existing saldo - 300 (dari placed order #1)
3. Di halaman admin, withdrawal summary tercatat dengan benar (minta data ke finance)
4. Di tabel withdrawal detail pastikan tercatat dengan benar</description>
   <name>TCT-WD02</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>ab005723-ec6d-4f93-b1a3-cda2dd1bf36a</testSuiteGuid>
   <testCaseLink>
      <guid>58c54f91-2283-4468-a94a-9324a0addf30</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyer1</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>b6bcceac-5624-4e50-9c3d-94e3439bb488</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0101_Mainsite/010101_Homepage/ClosePanduanPengguna</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>3fd88295-d62b-4136-8206-45b02bd07c3c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010208_DompetBlanja/DompetBlanjaDirectPenarikanDana</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>719d1ddd-0dca-4ddf-af55-700b097ea287</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010208_DompetBlanja/DompetBlanjaWithdrawal</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>477926aa-bd14-4641-9aee-0e24ded6124d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010208_DompetBlanja/DompetBlanjaKonfirmasiPenarikanDanaDelayOTP</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>1c17e58c-b1b1-4a81-a005-d2d8e904c74d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010208_DompetBlanja/VerifyPenarikanDanaLog</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
