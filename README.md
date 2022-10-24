# Проект по автоматизации тестирования android-приложения  "Wikipedia"
<img title="Wiki img" src="images/title/Title_Wiki.jpeg">

#### <a target="_blank" href="https://github.com/wikimedia/apps-android-wikipedia/releases">Ссылка на репозиторий приложения</a>

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#notebook_with_decorative_cover-реализованные-проверки">Реализованные проверки</a>
- <a href="#electric_plug-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
- <a href="#👽-отчет-browserstack">Отчет BrowserStack</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#hammer-allure-test-ops-отчет">Allure Test Ops отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-пример-прохождения-тестов">Видео пример прохождения тестов</a>

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logoTools/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logoTools/Java.svg">
<img width="6%" title="Selenide" src="images/logoTools/Selenide.svg">
<img width="6%" title="Appium" src="images/logoTools/appium.svg">
<img width="6%" title="Selenoid" src="images/logoTools/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logoTools/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logoTools/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logoTools/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logoTools/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logoTools/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logoTools/Telegram.svg">
</p>

## :notebook_with_decorative_cover: Реализованные проверки
- Проверка онбординга
- Проверка капчи и ее атрибутов, при регистрации нового пользователя
- Проверка актуальности даты ежедневной статьи, на главной поисковой странице
- Проверка заголовка искомой статьи
- Проверка кнопки, ведущую на подборки ежедневных статей

## :electric_plug: Сборка в Jenkins
##### <a target="_blank" href="https://jenkins.autotests.cloud/job/Automated_Mobile_Tests_HW21-22/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/title/AssemblyInJenkins.png">
</p>  

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean android -Dhost=local
```
Запуск в Jenkins:
```
gradle clean android -Dhost=browserstack
```
## :gear: Запуск тестов с выбором параметров
<img title="Jenkins ParamStart" src="images/img_2.png">

## 👽 Отчет BrowserStack
Пока бегут наши тесты в Jenkins, за ними можно подсматривать в личном кабинете BrowserStack - это очень занимательно, 
а после прогона всех, нужным нам, тестов - сервис сгенерирует еще дополнительные и ценные отчеты по состоянию устройства, например.
<img title="BrowserStack dashboard" src="images/img_1.png">

## :open_book: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/img_3.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/img_4.png">
</p>

## :hammer: Allure Test Ops отчет
<p align="center">
<img title="Allure Test Ops Launch" src="images/img_5.png">
</p>

## :robot: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/img_6.png">
</p>

## :film_projector: Видео пример прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/876f475c91f3138b9272c6559f5864e2fcca7ea3.gif">
</p>

