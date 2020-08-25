Feature: youtube
  as a web user
  i want to use youtube
  to watch my favorite videos and listen to music

  Scenario: Search a song
    Given that leandra want to listen her favorite song
    When she searches the song Felina
    Then she should see at least 1 video listed
