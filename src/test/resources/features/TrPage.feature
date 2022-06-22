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
      | HomePage   | https://www.openenglish.com.tr/ | Online İngilizce Eğitimi - Open English Türkiye |
      | Kurs | https://www.openenglish.com.tr/kurs/  | En İyi Online İngilizce Kursu - Open English Türkiye |
      | Nasil Calisir | https://www.openenglish.com.tr/nasil-calisir/ | İngilizce Kursumuz Nasıl Çalışır - Open English Türkiye |
      | Egitmenlerimizle Tanis| https://www.openenglish.com.tr/online-ingilizce-egitmenlerimiz/ | Online İngilizce Eğitmenlerimiz - Open English Turkey |
      | toeic-ielts-toefl-sinav-hazirlik | https://www.openenglish.com.tr/toeic-ielts-toefl-sinav-hazirlik/ | TOEIC / IELTS / TOEFL Sınavlarına Hazırlık - Open English Türkiye |
      | is ingilizcesi | https://www.openenglish.com.tr/is-ingilizcesi-mesleki-ingilizce/                   | İş İngilizcesi / Mesleki İngilizce - Open English Türkiye         |
      | Linguaskill Cambridge | https://www.openenglish.com.tr/linguaskill-cambridge-seviye-testi/          | Linguaskill Cambridge Seviye Testi - Open English Türkiye         |
      | Blog                  | https://www.openenglish.com.tr/blog/                                        | Blog - İngilizceye Dair Yazılar |
      | bize ulasin           | https://www.openenglish.com.tr/bize-ulasin/                                 | Bize Ulaşın                    |
      | kampanyalar           | https://www.openenglish.com.tr/kampanyalar/                                 | İngilizce Kurs Kampanyalarımız - Open English Türkiye |
      | sss                   | https://www.openenglish.com.tr/sss/                                         | Sıkça Sorulan Sorular             |

  @wip
  Scenario: Fill the leadform
    Given the user is on homepage
    When the user fill the leadform
    Then the user goes to thankyou page


