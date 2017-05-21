<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="etiquetasHead.jsp" />
	</head>

<body>

	<jsp:include page="navegador.jsp" />
	<br/>
<!-- Inicio Form-->



<div class="container">
			<div class="row main">
				<div class="main-login main-center">

				 <ul class="nav nav-tabs">

				<li class="active" ><a data-toggle="tab" href="#menu1">Registrate</a></li>
				    <li><a data-toggle="tab" href="#menu2">Registrate como Empresa</a></li>
				    </ul>

					<form:form action="registrar-usuario" method="POST" modelAttribute="usuario">

			
					
					  <div class="tab-content">
    					<div id="menu1" class="tab-pane fade in active">
     					 <h3>Comenzá ahora, miles de servicios te estan esperando!</h3>

						
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">1.</span>
									  <input type="text" class="form-control" path="nombre" id="nombre" placeholder="Nombre" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

								
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">2.</span>
									  <input type="text" class="form-control" name="apellido" id="apellido" placeholder="Apellido" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

		
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">3.</span>
									  <input type="text" class="form-control" name="email" id="email" placeholder="Correo Electrónico" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">4.</span>
									  <input type="text" class="form-control" name="password" id="password" placeholder="Contraseña" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

							<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">5.</span>
									  <input type="text" class="form-control" name="confirm" id="confirm" placeholder="Confirme Contraseña" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

						</div>


							    <div id="menu2" class="tab-pane fade">
							      <h3>Sé parte de Mercado Party y obtené beneficios</h3>
							      <p>*Los datos que ingresará a continuación son propios de su Empresa/Comercio. Tenga en cuenta que estos datos pueden ser públicos dentro de sus publicaciones.</p>
				
			

							    <div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">1.</span>
									  <input type="text" class="form-control" name="nombreEmp" id="nombreEmp" placeholder="Nombre" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

								
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">2.</span>
									  <input type="text" class="form-control" name="emailEmp" id="emailEmp" placeholder="Correo Electrónico" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

		
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">3.</span>
									  <input type="text" class="form-control" name="tel" id="tel" placeholder="Teléfono" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">4.</span>
									  <input type="text" class="form-control" name="direccion" id="direccion" placeholder="Dirección" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

							<div class="form-group">
								<div class="cols-sm-6">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">5.</span>
									    <select class="form-control" >
									   <option default>¿En qué zona se encuentra?</option>
                                        <option value="0">Capital Federal</option>
                                        <option value="1">Zona Sur</option>
                                        <option value="2">Zona Oeste</option>
                                        <option value="3">Zona Norte</option>
                                    </select>
									</div>
								</div>
						</div>

								<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">6.</span>
									  <input type="text" class="form-control" name="passwordEmp" id="passwordEmp" placeholder="Contraseña" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>


								<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">7.</span>
									  <input type="text" class="form-control" name="confirmEmp" id="confirmEmp" placeholder="Confirme Contraseña" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>


						</div>

						</div>

						<div class="form-group ">
<!-- 							<a href="http://deepak646.blogspot.in" target="_blank" type="button" id="button" class="btn btn-primary btn-lg btn-block login-button">Register</a> -->
						 <button type="submit" class="btn btn-success">Registrar</button>
						</div>
<!--             <button type="submit" class="btn btn-success">Registrar</button> -->						
					</form:form> 
				</div>
			</div>
		</div>




<jsp:include page="footer.jsp" />

</body>
</html>