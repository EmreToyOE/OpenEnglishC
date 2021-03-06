Feature: Pages Check

  Background: The user is on homepage

  Scenario Outline: The user visit pages and check broken images
    * the user visit "<pageUrl>"
    * there is no broken image
    Examples:
      | Page Heading | pageUrl                  |
      | HomePage   | https://www.openenglish.com.tr/ |
      | Kurs | https://www.openenglish.com.tr/kurs/  |
      | Nasil Calisir | https://www.openenglish.com.tr/nasil-calisir/ |
      | Egitmenlerimizle Tanis| https://www.openenglish.com.tr/online-ingilizce-egitmenlerimiz/ |
      | toeic-ielts-toefl-sinav-hazirlik | https://www.openenglish.com.tr/toeic-ielts-toefl-sinav-hazirlik/ |
      | is ingilizcesi | https://www.openenglish.com.tr/is-ingilizcesi-mesleki-ingilizce/                   |
      | Linguaskill Cambridge | https://www.openenglish.com.tr/linguaskill-cambridge-seviye-testi/          |
      | Blog                  | https://www.openenglish.com.tr/blog/                                        |
      | bize ulasin           | https://www.openenglish.com.tr/bize-ulasin/                                 |
      | kampanyalar           | https://www.openenglish.com.tr/kampanyalar/                                 |
      | sss                   | https://www.openenglish.com.tr/sss/                                         |

  @smoke
  Scenario Outline: The user visit pages and check broken links
    * the user visit "<pageUrl>"
    * there is no broken link


    Examples:
      | Page Heading | pageUrl                  |
      | HomePage   | https://www.openenglish.com.tr/ |
      | Kurs | https://www.openenglish.com.tr/kurs/  |
      | Nasil Calisir | https://www.openenglish.com.tr/nasil-calisir/ |
      | Egitmenlerimizle Tanis| https://www.openenglish.com.tr/online-ingilizce-egitmenlerimiz/ |
      | toeic-ielts-toefl-sinav-hazirlik | https://www.openenglish.com.tr/toeic-ielts-toefl-sinav-hazirlik/ |
      | is ingilizcesi | https://www.openenglish.com.tr/is-ingilizcesi-mesleki-ingilizce/                   |
      | Linguaskill Cambridge | https://www.openenglish.com.tr/linguaskill-cambridge-seviye-testi/          |
      | Blog                  | https://www.openenglish.com.tr/blog/                                        |
      | bize ulasin           | https://www.openenglish.com.tr/bize-ulasin/                                 |
      | kampanyalar           | https://www.openenglish.com.tr/kampanyalar/                                 |
      | sss                   | https://www.openenglish.com.tr/sss/                                         |



  @smoke
  Scenario Outline:  Check page title

    *  Page element "<Page URL>"  "<Page Title>" is as expected


    Examples:
      | Page Heading | Page URL                  | Page Title |
      | HomePage   | https://www.openenglish.com.tr/ | Online ??ngilizce E??itimi - Open English T??rkiye |
      | Kurs | https://www.openenglish.com.tr/kurs/  | En ??yi Online ??ngilizce Kursu - Open English T??rkiye |
      | Nasil Calisir | https://www.openenglish.com.tr/nasil-calisir/ | ??ngilizce Kursumuz Nas??l ??al??????r - Open English T??rkiye |
      | Egitmenlerimizle Tanis| https://www.openenglish.com.tr/online-ingilizce-egitmenlerimiz/ | Online ??ngilizce E??itmenlerimiz - Open English Turkey |
      | toeic-ielts-toefl-sinav-hazirlik | https://www.openenglish.com.tr/toeic-ielts-toefl-sinav-hazirlik/ | TOEIC / IELTS / TOEFL S??navlar??na Haz??rl??k - Open English T??rkiye |
      | is ingilizcesi | https://www.openenglish.com.tr/is-ingilizcesi-mesleki-ingilizce/                   | ???? ??ngilizcesi / Mesleki ??ngilizce - Open English T??rkiye         |
      | Linguaskill Cambridge | https://www.openenglish.com.tr/linguaskill-cambridge-seviye-testi/          | Linguaskill Cambridge Seviye Testi - Open English T??rkiye         |
      | Blog                  | https://www.openenglish.com.tr/blog/                                        | Blog - ??ngilizceye Dair Yaz??lar |
      | bize ulasin           | https://www.openenglish.com.tr/bize-ulasin/                                 | Bize Ula????n                    |
      | kampanyalar           | https://www.openenglish.com.tr/kampanyalar/                                 | ??ngilizce Kurs Kampanyalar??m??z - Open English T??rkiye |
      | sss                   | https://www.openenglish.com.tr/sss/                                         | S??k??a Sorulan Sorular             |

  @wip
  Scenario: Fill the leadform
    Given the user is on homepage
    When the user fill the leadform
    Then the user goes to thankyou page


