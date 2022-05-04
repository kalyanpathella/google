Feature: google search

  Scenario: 
    Given open "chrome" browser
    When i launch "https://www.google.co.in" of site
    Then identify broken links and display
    Then close site
 
  Scenario Outline: title testing
    Given open "<bn>" browser
    When i launch "<url>" of site
    Then title sohuld be "Google"
    When i entered a value and verfy title
      | word         |
      | abdul kalam  |
      | steve jobs   |
      | thomas kutty |
      | mithali      |
    Then close site

    Examples: 
      | bn     | url                      |
      | chrome | https://www.google.co.in |
      #| firefox | https://www.google.co.in |
