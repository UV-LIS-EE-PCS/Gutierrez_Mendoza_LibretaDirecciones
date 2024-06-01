# Proyecto - Aplicación de consola “libreta de direcciones” by Julio Gutiérrez Mendoza
![image](https://github.com/yuyo272003/AddressBook/assets/160281992/a292e663-f865-4c32-a19c-98d39a8f606b)

###  Universidad Veracruzana
### Facultad de Contaduría y Administración
### Programa Educativo
#### Ingeniería en Software
### Experiencia Educativa
#### Principios de Construcción de Software
### Docente
#### Dr. José Antonio Vergara Camacho

## SECCIÓN A DESCRIPCIÓN 
### A.1) Estado del sistema:
- AddressBookApplication: Esta clase sirve como punto de entrada para la aplicación, manejando las interacciones del usuario a través de un menú e interactuando con la clase AddressBook.

- AddressBook: Esta clase administra la colección de contactos, proporcionando métodos para agregar, eliminar, encontrar y mostrar contactos.

- AddressEntry: Esta clase representa una entrada de contacto individual, almacenando información como nombre, dirección, correo electrónico y número de teléfono.

- Menu: Esta clase maneja la interfaz de usuario, mostrando opciones de menú y procesando la entrada del usuario.

### A.2) Lista de clases:

  <table>
        <thead>
            <tr>
                <th>Clase</th>
                <th>Propósito</th>
                <th>Descripción Breve</th>
                <th>Eficiencia</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>AddressBookApplication</td>
                <td>Punto de entrada de la aplicación</td>
                <td>Administra las interacciones del usuario y se coordina con la clase AddressBook.</td>
                <td>N/A (Punto de entrada)</td>
            </tr>
            <tr>
                <td>AddressBook</td>
                <td>Gestión de contactos</td>
                <td>Almacena, agrega, elimina, encuentra y muestra contactos.</td>
                <td>Eficiente para operaciones CRUD básicas utilizando la estructura de datos ArrayList.</td>
            </tr>
            <tr>
                <td>AddressEntry</td>
                <td>Representación de contacto</td>
                <td>Almacena detalles de contacto individuales (nombre, dirección, correo electrónico, teléfono).</td>
                <td>N/A (Estructura de datos)</td>
            </tr>
            <tr>
                <td>Menu</td>
                <td>Interfaz de usuario</td>
                <td>Muestra opciones de menú y procesa la entrada del usuario.</td>
                <td>N/A (Interacción del usuario)</td>
            </tr>
        </tbody>
    </table>

### Consideraciones de eficiencia:

- La clase AddressBook utiliza una estructura de datos ArrayList para almacenar contactos. Esto proporciona operaciones de inserción y eliminación eficientes (O(1) complejidad de tiempo promedio).
- El método findAddressEntry utiliza una búsqueda lineal a través del ArrayList para encontrar contactos coincidentes. Si bien no es el más eficiente para conjuntos de datos grandes, es adecuado para listas de contactos pequeñas a medianas.

## SECCIÓN B URL DE JAVADOC 
### Link del JavaDoc del Proyecto : [Link](https://tubular-scone-7b2e20.netlify.app/package-summary.html)

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/b7f0c566-be25-4888-ab05-f557172f8049)

## SECCIÓN C UML/DISEÑO 
### Link de Diagrama de Clases UML: [Link](https://lucid.app/lucidchart/0ddc8334-ac59-47c3-a06d-8f8159e7ee1a/edit?viewport_loc=-1928%2C-806%2C3239%2C1583%2C0_0&invitationId=inv_d9764257-d67f-4924-9426-6d64288274b4)
![Diagrama de Clases UML de AddressBook](https://github.com/yuyo272003/AddressBook/assets/160281992/867b0b7e-42f7-48f6-b407-aa478f80dcfc)


## SECCIÓN D CAPTURAS DE PANTALLA DEL SISTEMA

### EVIDENCIA 1: 

1: Leer entradas del archivo de datos seguidas de Mostrar listado. El archivo de datos debe contener un mínimo de 2 direcciones. Incluir captura de pantalla de salida y también mostrar el contenido correspondiente
del archivo de datos

#### Archivo de Datos.txt
![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/9a8f4b21-f566-4b27-8c4d-d46b5b17de0f)

#### Selección de Leer Archivo y Lectura del Archivo 
![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/37ee8963-c3cc-4821-ad49-e2fac8b46e25)

#### Introducción de Ruta y Cargado de datos

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/7ccfdaa7-358e-4c80-b55c-c257db3647ba)

#### Muestra de los datos 

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/3027be8a-dc08-4488-8112-2ad942e5aec9)

### EVIDENCIA 2:

Inmediatamente después de D.1, agregue un nuevo objeto AddressEntry seguido de un mostrar el resultado de un nuevo listado en
consola

#### Invocación de AddressEntry 

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/5b39974c-910a-42b4-a928-05562e9e6223)

##### Nuevo Listado 
![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/c4787c92-8fab-4132-b262-f952dc4b1d55)

#### Mostrar Nuevo Listado 

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/a35cf49d-b5e9-4cc6-851f-3cea3e94ca77)

### EVIDENCIA 3: 

Inmediatamente después de D.2 hacer una eliminación de una entrada seguida de un mostrar listado

#### Llamada a Eliminar

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/47eced5f-c551-402e-85d2-3eb7ad91e377)

#### Entrada del contacto 

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/d480dfe8-9159-49fa-bf9c-e465f13e0415)

#### Solicitud de Confirmación para eliminar el contacto

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/15181059-d3eb-430e-bf6e-1dfda41a959e)

#### Muestra de Eliminación exitosa

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/2c31a100-477e-4a98-8225-ea8a6204074d)

### EVIDENCIA 4: 

Inmediatamente siguiendo D.3 hago una búsqueda usando una entrada que debería recuperar al menos una entrada. Ahora haga una búsqueda usando una entrada que no debería recuperar ninguna entrada.
Coloque capturas de pantalla de cada hallazgo aquí.

### Busqueda de una entrada existente 

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/e33e04cd-327a-464e-8fe3-ed94f7058d3f)

### Busqueda de una entrada inexistente

![image](https://github.com/yuyo272003/Gutierrez_Mendoza_LibretaDirecciones/assets/160281992/85dd9ff8-b911-4fbd-87a5-5985d6bedd0c)

