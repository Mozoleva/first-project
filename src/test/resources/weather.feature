Feature: Testing Weather API
  Scenario: Checking weather for the city
    Given city id: 524901 //id города

    When we are requesting weather data

    Then coord are:
    |lon|145.77|
    |lat|-16.92|

    And weather is:
      | id           | 802              |
      | main         |Clouds            |
      | description  | scattered clouds |
      | icon         | 02n              |

    And base is "stations"

    TODO: Homework: add all other steps