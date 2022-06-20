**_BAZAR_**


Escenario
Un bazar ha incrementado en gran medida sus ventas. Dado esto y que le está siendo casi imposible registrar las mismas y manejar el stock de sus productos de forma manual, necesita del desarrollo de una aplicación que le permita realizar esta tarea. La dueña del bazar manifiesta que todas las operaciones que tenga la aplicación se deben poder realizar mediante dos tipos de clientes http distintos:
• Una aplicación web, cuyo frontend desarrollará un programador amigo (no será parte de nuestra tarea como desarrolladores backend).
• Una aplicación Mobile que será implementada a futuro.

Cada una de estas app representa a los dispositivos que ella y sus empleados manejan actualmente. En síntesis: una computadora y varios celulares. Dada esta situación particular y de que necesita utilizar el mismo backend para ambas opciones, solicita el desarrollo de una API.


# Requerimientos

A partir del relevamiento realizado respecto al modelado, la dueña del bazar especificó que tiene los siguientes requerimientos: <br> <br>

1.	<strong>Poder realizar un CRUD completo de productos </strong> <br>
      a.	<strong>Métodos HTTP:</strong> GET, POST, DELETE, PUT  <br>
      b.	<strong>Endpoints:</strong>  <br>
      <strong>Creación:</strong> localhost:8080/productos/crear <br>
      <strong>Lista completa de productos:</strong> localhost:8080/productos <br>
      <strong>Traer un producto en particular: </strong> localhost:8080/productos/{codigo_producto} <br>
      <strong>Eliminación:</strong> localhost:8080/productos/eliminar/{codigo_producto} <br>
      <strong>Edición:</strong> localhost:8080/productos/editar/{codigo_producto} <br>
      <br>

2.	<strong>Poder realizar un CRUD completo de clientes </strong><br>
      a.	<strong>Métodos HTTP:</strong> GET, POST, DELETE, PUT <br>
      b.	<strong>Endpoints:</strong>  <br>
      <strong>Creación:</strong> localhost:8080/clientes/crear <br>
      <strong>Lista completa de clientes:</strong> localhost:8080/clientes <br>
      <strong>Traer un cliente en particular::</strong> localhost:8080/clientes/{id_cliente} <br>
      <strong>Eliminación::</strong> localhost:8080/clientes/eliminar/{id_cliente} <br>
      <strong>Edición::</strong> localhost:8080/clientes/editar/{id_cliente} <br>
      <br>

3.	<strong>Poder realizar un CRUD completo de ventas </strong><br>
      a.	<strong>Métodos HTTP:</strong> GET, POST, DELETE, PUT <br>
      b.<strong>	Endpoints:  </strong><br>
      <strong>Creación:</strong> localhost:8080/ventas/crear <br>
      <strong>Lista completa de ventas realizadas:</strong> localhost:8080/ventas <br>
      <strong>Traer una venta en particular:</strong> localhost:8080/ventas/{codigo_venta} <br>
      <strong>Eliminación:</strong> localhost:8080/clientes/eliminar/{codigo_venta} <br>
      <strong>Edición:</strong> localhost:8080/clientes/editar/{codigo_venta} <br>
      <br>

Nota: No es necesario para este requerimiento actualizar el stock de un producto (descontar) al realizar una venta, ni tampoco controlar si cuenta con la cantidad disponible para vender; sin embargo, se considerará como “plus” o extra (para el bonus del punto 8) si se desea implementar la funcionalidad.

4. 	Obtener todos los productos cuya cantidad_disponible sea menor a 5
   a.	<strong>Métodos HTTP:</strong> GET <br>
   b.	<strong>Endpoint: </strong> localhost:8080/productos/falta_stock <br>
   <br>

5.	<strong>Obtener la lista de productos de una determinada venta</strong> <br>
      a.	<strong>Métodos HTTP:</strong> GET <br>
      b. <strong>	Endpoint: </strong> localhost:8080/ventas/productos/{codigo_venta} <br>
      <br>

6.	<strong>Obtener la sumatoria del monto y también cantidad total de ventas de un determinado día </strong><br>
      a.	<strong>Métodos HTTP:</strong> GET <br>
      b.	<strong>Endpoint: </strong> localhost:8080/ventas/{fecha_venta} <br>

7.	<strong>Obtener el codigo_venta, el total, la cantidad de productos, el nombre del cliente y el apellido del cliente de la venta con el monto más alto de todas. </strong> <br>
      a.	<strong>Métodos HTTP:</strong> GET <br>
      b.	<strong>Endpoint:</strong>  localhost:8080/ventas/mayor_venta <br>
      <br>