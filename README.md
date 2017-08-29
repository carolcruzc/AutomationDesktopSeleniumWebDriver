# AutomationDesktopSeleniumWebDriver
Automation on Desktop app using Selenium WebDriver and Cucumber
<br /><b><i>in english below</i></b>

Fiz um código de exemplo utilizando Selenium WebDriver no Java com Cucumber em uma automação Desktop.
Basicamente eu escrevi um “Hello World” no Notepad++ e salvei.
Para o funcionamento dessa automação precisamos de alguns itens:

1.	Baixar o executável do UiSpy
<a href = "https://github.com/2gis/Winium.Cruciatus/tree/master/tools/UISpy" target = "blank">https://github.com/2gis/Winium.Cruciatus/tree/master/tools/UISpy</a>

2.	Baixar o Winium (necessário ter o Visual Studio instalado)
<a href = "https://github.com/2gis/Winium.Desktop" target="_blank">https://github.com/2gis/Winium.Desktop</a>

Utilizamos o UiSpy para visualizar os elementos do app que desejamos automatizar. Alguns possuem Id (AutomationId), outros precisaremos localizar pelo name, classname, etc.<br />
<b>Observação importante:</b> a cada mudança na tela, enquanto utiliza-se o UiSpy, é necessário fechá-lo e abrí-lo novamente.

Com o código no Java pronto, é necessário abrir o Winium, que nada mais é do que uma ferramenta que gera um driver para permitir ao selenium acessar uma aplicação em execução na área de trabalho.
	<pre>Winium.Desktop-master\src\Winium.sln</pre>

Quando abrir no VisualStudio, clicar em run.
Abrirá uma tela no prompt de comando informando a porta. Deixe essa tela aberta e insira a porta na sua classe de setUp (explicitado abaixo).
Voltando ao Java:
O grande diferencial no Selenium ficará por conta do @Before.


```java
@Before
public void setUp() throws Throwable {
//definir o local do programa que será executado
DesiredCapabilities dc = new DesiredCapabilities();
dc.setCapability("app", 	
		"C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
//app -> indica que o selenium irá abrir um sw desktop. Sempre é essa palavra
				
			
//inicializar o selenium wb
driver = new RemoteWebDriver(new URL("http://localhost:9999") , dc);
//A porta "9999" foi informada pelo VisualStudio, quando rodamos o Winium
}
```

------------------x----------------------------
<br /><br />
I made a sample code using Selenium WebDriver in Java with Cucumber in a Desktop automation.
Basically I wrote a "Hello World" in Notepad ++ and saved it.

For the operation of this automation we need some items:

1. Download the UiSpy executable
<a href = "https://github.com/2gis/Winium.Cruciatus/tree/master/tools/UISpy" target = "blank">https://github.com/2gis/Winium.Cruciatus/tree/master/tools/UISpy</a>

2. Download Winium (Visual Studio must be installed)
<a href = "https://github.com/2gis/Winium.Desktop" target="_blank">https://github.com/2gis/Winium.Desktop</a>

We use UiSpy to view the elements of the app we want to automate. Some have Id (AutomationId), others we need to find by name, classname, etc.

<b>Important note:</b> every time you change the screen while using UiSpy, you must close it and open it again.
With the code in Java ready, it is necessary to open Winium, which is a tool that generates a driver to allow selenium to access an application running on desktop.
<pre>Winium.Desktop-master \ src \ Winium.sln</pre>
Open it with VisualStudio and click in run.
It will open a command prompt screen informing the browser port. Leave this screen open and insert the port into your setUp class (explained below).
Returning to Java:
The big differential in Selenium will be @Before.

```java
@Before
public void setUp() throws Throwable {
// define the location of the program to be executed
DesiredCapabilities dc = new DesiredCapabilities();
dc.setCapability("app", 	
		"C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
// app -> indicates that selenium will open a desktop sw. It's always that word
				
			
//inicializar o selenium wb
driver = new RemoteWebDriver(new URL("http://localhost:9999") , dc);
// The port "9999" was informed by VisualStudio, when we ran the Winium
}
```
