Feature: TestMeApp End to End Test

@login @smoke
Scenario: Testme Login Test
Given user open testmeapp online
When user enter username as "lalitha" And password as "Password123"
Then click on Login button
And verify login success

@search
Scenario Outline: Search product
When user enter "<productname>" in search field
Then verify testmeapp displays related items page

Examples:
|productname|
|laptop|
|travel kit|

@logout
Scenario: Testme Logout Test
When user clicks on logout button
Then verify logout success
