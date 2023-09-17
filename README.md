<!DOCTYPE html>
<html>
<head>
    <script>
 var vaiPiscar = 0; setInterval(piscar, 1000);
function piscar(){
if(vaiPiscar<1){
  vaiPiscar++;
  document.getElementById("piscando").style.opacity = '1';
} else{
  vaiPiscar = 0; 
  document.getElementById("piscando").style.opacity = '0';
}};


var vaiPiscar2 = 0;
setInterval(piscar2, 950);

function piscar2(){
if(vaiPiscar2<1){
  vaiPiscar2++;
  document.getElementById("piscando2").style.opacity = '1';
} else{
  vaiPiscar2 = 0; 
  document.getElementById("piscando2").style.opacity = '0';
}};

var vaiPiscar3 = 0;
setInterval(piscar3, 1000);

function piscar3(){
if(vaiPiscar3<1){
  vaiPiscar3++;
  document.getElementById("piscando3").style.opacity = '1';
} else{
  vaiPiscar3 = 0; 
  document.getElementById("piscando3").style.opacity = '0';
}};

var vaiPiscar4 = 0;
setInterval(piscar4, 950);

function piscar4(){
if(vaiPiscar4<1){
  vaiPiscar4++;
  document.getElementById("piscando4").style.opacity = '1';
} else{
  vaiPiscar4 = 0; 
  document.getElementById("piscando4").style.opacity = '0';
}};

var vaiPiscar5 = 0;
setInterval(piscar5, 700);

function piscar5(){
if(vaiPiscar5<1){
  vaiPiscar5++;
  document.getElementById("piscando5").style.opacity = '1';
} else{
  vaiPiscar5 = 0; 
  document.getElementById("piscando5").style.opacity = '0';
}};
  </script>
  </head>
<body onload="piscar();">
<h1 style="padding-left:20px;"> README: PROJETO CONVERSORES </h1>
<br><br>
<div style="display:inline-block;vertical-align:top; padding-left:20px">
        <img align=left src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/ConversorApresentacao.gif" alt="img">
</div>
<div style="display:inline-block;padding-left:40px;">
    <tr><h4>
        <td style="margin-bottom:20px; margin-left: 10px">INDICE</td><br><br>
        <td>1 Objetivo, Descricao e Funcionalidades</td><br>
    </h4></tr>
    <tr ><h4 style="align:center; margin-bottom:10px;margin-left:40px">
        <td > 1.1 Conversor de Moedas</h4></td>
        
        <h4 style="align:center; margin-bottom:10px;margin-left:40px"><td > 1.2 Conversor de Temperaturas</h4></td>

        <h4 style="align:center; margin-bottom:10px;margin-left:40px"><td > 1.3 Conversor de Unidades de Distância</h4></td>

        <h4 style="align:center; margin-bottom:10px;margin-left:40px"><td > 1.4 Conversor de Unidades de Massa</h4></td>
    </h4></tr>
    <tr><h4>
        <td>2 Ferramentas e Tecnologias Utilizadas</td><br>
        <td>3 Acesso ao Projeto</td><br>
        <td>4 Instruções para Abrir e Rodar o Projeto</td><br>
        <td>5 Desenvolvedora do Projeto</td><br>
        <td>6 Referências Bibliográficas</td>
    </h4></tr></h4></tr>
</div>
<br></br>


<div style="margin-top:0; padding-left:20px;">
 <h3>1 Descrição do Projeto e Funcionalidades:</h3>
 <p>O Projeto Conversores é o segundo Challenge do curso da Alura dentro do programa ONE (Oracle Next Education). Ele possui 4 programas conversores de unidades, criados totalmente em Java:</p>

 
<div style="display:inline-block;"><marquee direction="down" width="250" height="200" behavior="alternate" style="border:transparent;">
    <img src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/JOptionEscolheConversor.png">
</marquee></div>

<div style="display:inline-block;vertical-align:top ;padding-left:20px">
    <tr><marquee direction="down" width="250" height="200" behavior="alternate" style="border:transparent;">
        <td><b>Conversor de Moedas</b></td><br><br>
        <td><b>Conversor de Temperaturas</b></td><br><br>
        <td><b>Conversor de Unidades de Distância</b></td><br><br>
        <td><b>Conversor de Unidades de Massa</b></td><br><br>
    </marquee></tr>
</div>

<div style="padding-left:20px">
 <p>O Challenge da Alura delineou o desafio da criação do projeto, <b>criar um conversor na linguagem Java</b>, mediante algumas regras, entre elas, por exemplo, que se utilizassem a classe JOptionPane para apresentar as caixas de diálogo com as opções de escolha, que se utilizassem métodos de escolha como o switch, ou ainda como tratar e como informar as exceções ao usuário, por exemplo fazendo o programa apresentar uma mensagem sobre valor inválido ou, no final de uma conversão, se deseja sair ou continuar no programa.  O projeto foi feito seguindo uma reunião lógica de várias fontes diferentes, tais como classes, lógica, orientação a objetos, arquivos, regras, acesso externo, e assim por diante, a fim de obter o objetivo final, o software Java.</p>
<p>Cada programa conversor oferece várias opções de conversão entre unidades equivalentes, por exemplo, converte Reais para Dólares, graus Celsius para graus Fahrenheit, metros para polegadas, ou quilogramas para libras.</p>
</div>
<p></p>
</div>
<div style="padding-left:40px">
<p><b>1.1 </b><strong  id="piscando" style="font-family:Times New Roman; font-size: 18px;">Conversor de Moedas</strong> : O Conversor de Moedas apresenta opções para cambiar Real para 5 tipos de moedas diferentes (Dolar, Euro, Libra Esterlina, Peso Argentino e Peso Chileno) e destas 5 moedas para o Real. O programa atualiza em tempo real as cotações visitando o site do BancoCentral e coletando de lá os valores para o cálculo atualizado das conversões.</p>
</div>

<div>
<img style="padding-left:40px;"src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/ConversorDeMoedas.png">

<marquee style="padding-left:40px;" direction="up" width="250" height="250" behavior="alternate" style="border:transparent">
  <marquee behavior="alternate"><img  src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/ResultadoConverteMoeda.png">
</marquee></marquee></div>

<br></br>

</div>
<br></br>

<div style="padding-left:40px">
<p><b>1.2 </b><strong  id="piscando2" style="font-family:Times New Roman; font-size: 18px;">Conversor de Temperaturas</strong>: O Conversor de Temperaturas converte 3 tipos de temperaturas diferentes: Celsius, Fahrenheit e Kelvin. </p>
</div>

<div>
<img style="padding-left:40px;"src="file:///C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/ConversorTemperatura250.png">

<img id="piscando5" style="padding-left:40px; vertical-align:top;"src="file:///C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/EscolheTemperatura.png">
</div>
<br></br>


<div style="padding-left:40px">
<p><b>1.3 </b><strong  id="piscando3" style="font-family:Times New Roman; font-size: 18px;">Conversor de Unidades De Distância</strong> : O Conversor de Unidades de Distância converte unidades do sistema métrico e do sistema imperial: centímetros, metros, kilômetros, polegadas, pés, milhas, milhas náuticas e léguas. </p>
</div>
<div>
<img style="padding-left:40px;"src="file:///C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/ConverteDistancia.gif">
</div>
<br></br>


<div style="padding-left:40px">
<p><b>1.4 </b><strong  id="piscando4" style="font-family:Times New Roman; font-size: 18px;">Conversor de Unidades de Massa</strong> : O Conversor de Unidades de Massa converte quilogramas, gramas, libras, libras Troy, onças, onças Troy e quilates</p>
</div>

<div>
<img style="padding-left:40px;"src="file:///C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/ConversorMassa250.png">
<img style="padding-left:40px;"src="file:///C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/QuilateParaGrama.gif">
</div>

<br></br>

 <h3 style="padding-left:20px;">2 Ferramentas e Tecnologias Utilizadas</h3>

 <div>
 <img style="padding-left:20px; padding-right:40px;" src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/LogoOracle.png">
 
 <img style="padding-right:40px;"src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/LogoJava.png">

 <img style="padding-right:40px;"src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/LogoEclipse.png">
 
 <img style="padding-right:40px;"src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/LogoWindows8.png">

 <img style="padding-right:40px;"src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/LogoGimp.png">

<img style="padding-right:40px;"src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/LogoAlura.png">

<img src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/LogoOracleONENextEducation.png">

</div>
<div style="padding-left:20px; font-size:16">
    <tr>
        <td>Windows 8.1 64</td><br>
        <td>Java:</td>
</tr></div>
<div style="padding-left:40px; font-size:16">
    <tr>
                <td>. Java version 17.0.7 LTS</td><br>
                <td>. Java(TM) SE Runtime Environment</td><br>
                <td>. Java HotSpot(TM) 64-Bit server VM (build 17.0.7 + 8-LTS-224, mixed mode, sharing)</td><br>
    </tr>
</div>
<div style="padding-left:20px; font-size:16">
    <tr>
        <td>Eclipse IDE 2023-03 for Windows x86-64 </td><br>
        <td>Paradigma de Orientação a Objetos</td><br>
        <td>Alura Curso de Formação em Back End</td><br>
        <td>Oracle Programa ONE Next Education ministrado pela Alura</td><br>
        <td>Gimp 2.10.32</td><br>
        <td>https: ezgif.com</td>
    </tr>
</div>


<div style="padding-left:20px;">
<h3 >3 Acesso ao Projeto</h3>

<p> O acesso ao projeto é público e pode ser copiado com os códigos e documentação completa (respeitados os direitos de autoria) no <a href=" https://github.com/mariahelenaostetto"> site do GitHub</a></p>
</div>


<div style="padding-left:20px;">
 <h3 >4 Abrir e Rodar Projeto</h3>

 <p>O projeto está disponível para download gratuito no <a href=" https://github.com/mariahelenaostetto"> site do Github</a> sob o nome <strong>ProjetoConversores.jar</strong>. O programa foi feito para Windows e necessita o Java instalado.
 O Java pode ser instalado gratuitamente através do <a href="https://www.java.com/br/download/"> site oficial do Java</a>.
 Basta um duplo clique no projeto para que ele comece a rodar. Uma janela pode ser exibida ao clicar no projeto perguntando qual programa será usado para abrir o arquivo e neste caso escolha Java(TM).</p>
</div>


<div style="padding-left:20px;">
<h3> 5 Desenvolvedora do Projeto</h3>

 <p>#Maria Helena Ostetto (Farmacêutica-Bioquímica, formada pela UFSC - Universidade Federal de Santa Catarina. Atualmente estudante de Tecnologia na Alura em curso de especiatdzação Back-End. Já recebeu uma Badge por cumprir o primeiro Challenge, criar um Codificador/Decodificador de texto em Javascript (o projeto pode ser visitado no <a href="https://mariahelenaostetto.github.io/Projeto2/"> site do GitHub. </a></p>
</div>
<br><br>

<div style="padding-left: 20px;">
<img src="C:/Users/jrost_000/Pictures/FOTOS%20MARIA%20HELENA/Eu3.jpg" width=115><br><sub>[Maria Helena Ostetto]</sub>
</div>
<div style="padding-left:20px;">
[(https://https://github.com/MariaHelenaOstetto)]<br>[(https://www.linkedin.com/in/maria-helena-ostetto/)]
<div style="padding-left:20px;">
<img src="C:/Users/jrost_000/Pictures/FO/especializacaoAlura/APRESENTACAOProjetoConversores/BadgeChallenge1AluraMiniatura.png"><br><sub>[Badge Challenge 1]</sub>
</div>
<br><br>
</div>
<div style="padding-left: 20px;">
<h3>6 Referências Bibliográficas</h3>
</div>
<div style="padding-left: 20px;">
    <tr><h4>
        <td>https://cursos.alura.com.br</td><br>
        <td>https://www.devmedia.com.br</td><br>
        <td>https://pt.stackoverflow.com</td><br>
        <td>https://guj.com.br</td><br>
        <td>https://docs.oracle.com</td>
    </h4>
    </tr>
</div>

</body>
</html>

