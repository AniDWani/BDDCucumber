Feature:BookCart Application tests

  Scenario Outline: Add to cart
    Given User navigate to the BookCart application
    And User login into the application with username as "<username>" and "<password>"
    And User search for a book "<book>"
    When User add the book to the cart
    Then the cart badge should get updated

    Examples:
      | username | password | book            |
      | ortoni   | pass1234 | Roomies         |
      | ortonikc | pass1234 | The Simple Wild |
