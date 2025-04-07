sistema de gestion de dispositivos electronicos

lo que necesita el programa:
-registrar clientes con datos validados 
-agregar dispositivos tecnologicos asegurando que el precio y el stock sean valores correctos
-se pueda modificar la dirección de la tienda en cualquier momento
-realizar ventas de dispositivos a clientes y se actualice el stock de los productos que se vendieron
-buscar dispositivos por la marca, modelo o tipo, para que los usuarios encuentren facilmente lo que buscan
-mantener toda la informacion actualizada en un archivo


PRINCIPALES CLASES Y FUNCIONALIDADES:

#DispositivoTecnologico (clase abstracta)
- que hace:  
  define los atributos basicos que comparten todos los dispositivos (marca, modelo, procesador, RAM, almacenamiento, año, precio y stock) 

#ComputadorEscritorio
- que hace: 
  hereda de la clase DispositivoTecnologico y añade detalles propios, como la tarjeta de video, fuente de poder, chasis y la pantalla
- Relacion:  
  Utiliza la clase Pantalla para representar los detalles de la pantalla

#Notebook
- que hace:
  Extiende DispositivoTecnologico e incluye datos especificos como la resolucion de la pantalla, tipo de teclado y bateria

#Tablet
- que hace: 
  tambien hereda de DispositivoTecnologico y agrega la resolucion de pantalla y una lista de accesorios

#Pantalla
- que hace:
  representa la pantalla que se utiliza en un computador de escritorio, con atributos como marca, modelo y año

#Cliente
- que hace: 
  guarda la informacion personal del cliente (ID, nombre, apellido, correo, numero de contacto, estado civil y ciudad) 

#Tienda
- que hace:  
  administra el catalogo de dispositivos y la direccion de la tienda  
- funcionalidades clave:  
  - permite agregar nuevos dispositivos
  - permite modificar la dirección de la tienda
  - ofrece metodos para buscar dispositivos por marca, modelo o tipo

#DetalleCompra y Compra
- que hace:
  - DetalleCompra: relaciona cada dispositivo con la cantidad vendida
  - Compra: registra la venta realizada a un cliente, guarda la fecha y una lista de detalles de la compra, y actualiza el stock de los dispositivos vendidos

#gestor de datos
- que hace:
  se encarga de escribir y actualizar la informacion en un archivo

relacion entre las clases:

- herencia: 
  Las clases ComputadorEscritorio, Notebook y Tablet heredan de DispositivoTecnologico, compartiendo informacion comun y personalizando sus metodos para mostrar especificaciones

  composiciion:  
  - ComputadorEscritorio se compone de una Pantalla
  - Tablet utiliza una lista de accesorios, lo que permite gestionar multiples elementos de forma dinamica

- agregacion: 
  - La clase Tienda agrupa a los dispositivos tecnologicos en un catalogo
  - La clase Compra asocia un Cliente con varios DetalleCompra, conectando la venta con los productos adquiridos

- persistencia:  
  La clase DataManager se encarga de que cada cambio (registro, modificación o venta) se refleje en el archivo de datos, asegurando que la informacion siempre este actualizada
