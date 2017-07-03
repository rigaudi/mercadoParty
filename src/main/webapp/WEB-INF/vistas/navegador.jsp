<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

		<nav id="navegador" class="navbar navbar-inverse">
		<div class="col-sm-3" id="primercolumna">
			<a href="/mercadoParty/"><img class="img-responsive" id="logo" src="img/logo.png" alt="logo"/></a>
		</div>
  
		<div class="col-sm-6" id="segundacolumna">
	            <div class="input-group" id="adv-search">
                <input type="text" class="form-control" placeholder="Buscar Servicios" />
                <div class="input-group-btn">
                    <div class="btn-group" role="group">
                        <div class="dropdown dropdown-lg">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" role="menu">
                                <form class="form-horizontal" action="/mercadoParty/listaProductos" role="form">
                                  <div class="form-group">
                                    <label for="filter">Filtrar por Zona</label>
                                    <select class="form-control">
                                        <option value="0" selected>Capital Federal</option>
                                        <option value="1">Zona Sur</option>
                                        <option value="2">Zona Oeste</option>
                                        <option value="3">Zona Norte</option>
                                    </select>
                                  </div>
                                  <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </form>
                            </div>
                        </div>
                       <a href="/mercadoParty/listaProductos"><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button></a>
                    </div>
                </div>
            </div>
  		</div>
  
		<div class="col-sm-3" id="terceracolumna">      
			<ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Inicia Sesion</b> <span class="caret"></span></a>
      <ul id="login-dp" class="dropdown-menu">
        <li>
           <div class="row">
              <div class="col-md-12">
                Inicia via
                <div class="social-buttons">
                  <a href="#" class="btn btn-fb"><i class="fa fa-facebook"></i> Facebook</a>
                  <a href="#" class="btn btn-gplus"><i class="fa fa-google-plus"></i> Google</a>
                </div>
                                o
                 <form:form class="form" method="post" action="validar-login" modelAttribute="usuario" id="login-nav">
                    <div class="form-group">
                       <label class="sr-only" for="exampleInputEmail2">E-Mail</label>
                       <form:input path="email" type="email" class="form-control" id="exampleInputEmail2" placeholder="Correo Electronico"/>
                    </div>
                    <div class="form-group">
                       <label class="sr-only" for="exampleInputPassword2">Contrase�a</label>
                       <form:input path="password" type="password" class="form-control" id="exampleInputPassword2" placeholder="Contrase�a"/>
                                             <div class="help-block text-right"><a href="/mercadoParty/registro">Registrarse</a></div>
                    </div>
                    <div class="form-group">
                       <button type="submit" value="login" class="btn btn-primary btn-block">Inicia Sesion</button>
                    </div>
                    <div class="checkbox">
                       <label>
                       <input type="checkbox"> Mantenerme conectado
                       </label>
                    </div>
                 </form:form>
              </div>
              <div class="bottom text-center">
               <a href="/mercadoParty/logout"><b>Cerrar sesi�n</b></a>
              </div>
           </div>
        </li>
      </ul>
        </li>
      </ul>
		</div>
	</nav>