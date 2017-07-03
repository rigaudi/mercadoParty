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
      <li><a href="/mercadoParty/panelUsuario"><span class="glyphicon glyphicon-user"></span> Panel de Control</a></li>
      <li><a href="/mercadoParty/logout"><span class="glyphicon glyphicon-log-out"></span> Cerrar Sesíon</a></li>
    </ul>
		</div>
	</nav>