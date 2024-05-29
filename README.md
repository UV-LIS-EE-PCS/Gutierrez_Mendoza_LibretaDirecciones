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

## SECCIÓN C UML/DISEÑO 
### Link de Diagrama de Clases UML: [Link](https://lucid.app/lucidchart/0ddc8334-ac59-47c3-a06d-8f8159e7ee1a/edit?viewport_loc=-1928%2C-806%2C3239%2C1583%2C0_0&invitationId=inv_d9764257-d67f-4924-9426-6d64288274b4)
![Diagrama de Clases UML de AddressBook](https://github.com/yuyo272003/AddressBook/assets/160281992/867b0b7e-42f7-48f6-b407-aa478f80dcfc)


## SECCIÓN D CAPTURAS DE PANTALLA DEL SISTEMA

### EVIDENCIA 1: 

### EVIDENCIA 2:

### EVIDENCIA 3: 

### EVIDENCIA 4: 
