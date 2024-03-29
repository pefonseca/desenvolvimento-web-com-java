<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Usu�rio</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">

		<form action="/cep" class="form-inline" method="post">

			<label>Cep:</label>
			<input type="text" name="cep" value="05875350" class="form-control">

			<button type="submit" class="btn btn-primary">Buscar</button>
		</form>

		<form action="/usuario/incluir" method="post">
			<h3>Cadastro de Usu�rio</h3>
		
			<div class="form-group">
				<label>Nome:</label> 	
				<input type="text" name="nome" value="Usuario da Silva" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Senha:</label>
				<input type="password" name="senha" value="Senha123" class="form-control">
			</div>
			
			<div class="form-group">
				<label>E-mail:</label>
				<input type="email" name="email" value="email@email.com" class="form-control">
			</div>
						
			<div class="form-group">
				<label>Idade:</label> 	
				<input type="text" name="idade" value="25" class="form-control">
			</div>

			<div class="form-group">
				<label>Sal�rio:</label> 	
				<input type="text" name="salario" value="999999" class="form-control">
			</div>

			<div class="form-group">
				<label>Caracter�sticas:</label>
			    <div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="caracteristicas" value="De" class="form-check-input" > Developer
			      </label>
			    </div>
			    <div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="caracteristicas" value="An" checked class="form-check-input"> Analista
			      </label>
			    </div>
			    <div class="form-check">
			      <label class="form-check-label">
		        		<input type="checkbox" name="caracteristicas" value="Da" class="form-check-input"> Database
			      </label>
			    </div>
			</div>

			<div class="form-group">						
				<label>Tipo:</label>			
				<div class="form-check">
				  <label class="form-check-label">
				    <input type="radio" name="tipo" value="P" class="form-check-input" > Padr�o
				  </label>
				</div>			
				<div class="form-check">
				  <label class="form-check-label">
					<input type="radio" name="tipo" value="D" class="form-check-input"> Diretor
				  </label>
				</div>			
				<div class="form-check">
				  <label class="form-check-label">
				    <input type="radio" name="tipo" value="A" checked class="form-check-input"> Administrador
				  </label>
				</div>			
			</div>
			
			<div class="form-group">
				<label>Setor:</label>
				<select name="setor" class="form-control">
					<option value="1">Diretoria</option>
					<option value="2">Comercial</option>
					<option value="3" selected>Desenvolvimento</option>
				</select>
			</div>

			<c:import url="/WEB-INF/jsp/endereco/cadastro.jsp"/>

			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>