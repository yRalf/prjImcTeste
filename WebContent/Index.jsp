
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import = "model.Imc"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IMC</title>
</head>
<body>
	<form action="Index.jsp" >
		<fieldset>
			<legend>Insira Seus Dados</legend>
			<p>
				<label for="idade">Idade:</label> <input type="number" id="idade"
					name="idade" min="0" />
			</p>
			<p>
				<label for="sexo">Sexo:</label> <select name="sexo" id="sexo">
					<option value="m">Masculino</option>
					<option value="f">Feminino</option>
				</select>
			</p>
			<p>
				<label for="peso">Peso:</label> <input type="number" id="peso"
					name="peso" min="0"  />
			</p>
			<p>
				<label for="altura">Altura:</label> <input type="number" id="altura"
					name="altura" min="0" />
			</p>
			<input type="submit" id="enviar" value="Calcular">
		</fieldset>

	</form>
	
	<%
	String sexo =  request.getParameter("sexo");
	int idade = Integer.parseInt(request.getParameter("idade"));
	float peso = Integer.parseInt(request.getParameter("peso"));
	float altura = Integer.parseInt(request.getParameter("altura"));

	Imc imc = new Imc(sexo, idade, peso, altura); %>
	
	
	<fieldset><legend>Compilado</legend>
	IMC:<%=imc.calculaImc() %><br>
	Status:<%=imc.statusImc() %><br>
	Peso Ideal:<%=imc.pesoIdeal() %><br>	
	</fieldset>


</body>
</html>