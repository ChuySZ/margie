<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


<html>
  <head>
    <meta http-equiv="content-type" content="text/html;
      charset=windows-1252">
    <meta name="GENERATOR" content="SeaMonkey/2.40 [en] (Windows; 10;
      Intel(R) Core(TM) i7-4500U CPU @ 1.80GHz 2.40 GHz) [Composer]">
    <meta name="Author" content="equipo: Bureau de investigación y desarrollo">
    <title>Forma de Búsqueda de Clientes</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
     
     <form method="get"
      action="${pageContext.request.contextPath}/cliente.search.jsp">
       <div class="step">Forma de busqueda de Cliente</div>
       <div class="instructions">Proporciona la información de la búsqueda solicitada
       </div>
       <br>
    <table border="1" cellpadding="10">
      <tbody>
        <tr>
          <td colspan="3" align="center" height="20"></td>
        </tr>
        <tr>
          <td class="menu" align="center" valign="top" width="150">
            </td>
          <td width="25"> <br>
          </td>
          <td align="center" valign="top" width="625">
            <div class="section"> Aplicación para el Mantenimiento de
              Clientes </div>
            <hr>
            <form method="get" action="http://aplicacion.com">
              <div class="step"> Forma de Búsqueda de Clientes </div>
              <div class="instructions"> Proporciona la información de
                búsqueda solicitada </div>
              <br>
              <table border="1" cellpadding="10">
                <tbody>
                  <tr>
                    <td align="center">
                      <table>
                        <tbody>
                          <tr class="form">
                            <td align="right">
                              <div class="label"> Patrón: </div>
                            </td>
                            <td> <input name="pattern" size="10"
                                value="a*"> </td>
                            <td> <input value="  Buscar  " type="button">
                      </td>
                    </tr>
                  </tbody></table>
                </td>
              </tr>
            </tbody></table>
            <br>
            <table border="0" width="100%">
              <tbody><tr class="form">
                <td align="center">
                  <div class="label">
                    Nombre
                  </div>
                </td>
                <td align="center">
                <div class="label">Paterno</div></td>
                <td align="center">
                <div class="label">Materno</div></td>
                <td align="center">
                <div class="label">Detalle</div></td>
                <td align="center">
                <div class="label">PDF</div></td>
                <td align="center">
                <div class="label">XLS</div></td>
              </tr>
              <sql:query var="resultados" dataSource="jdbc/TestDS"
              sql="SELECT *FROM cliente;"/>
              <c:forEach var="fila" items="${resultados.rows }">
                <tr>
                    <td align="center">${fila.nombre_cliente}</td>
                    <td align="center">${fila.apellido_paterno}</td>
                    <td align="center">${fila.apellido_materno}</td>
                    <td align="center">input type="button" 
                      value="Ver" onclick="windows.location='clienteForm?LLave'=${fila.idcliente}</td>
                    <td align="center">input type="button" 
                      value="Ver como PDF"</td>
                    <td align="center">input type="button" 
                      value="Ver como XLS"</td>
              </tr>
              </c:forEach>
              </table>
   
            <br>
            <input value="  Regresar  " onclick="window.location='main.html'" type="button">
          </form>
          <br>
        </td>
      </tr>
      <tr>
        
        <td colspan="3" align="center">
        
        </td>
        
      </tr>
    </tbody></table>
  

</body></html>