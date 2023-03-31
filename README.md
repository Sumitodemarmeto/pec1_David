<img src="https://user-images.githubusercontent.com/126669778/228374974-1f83a88c-6eaa-4fcd-bfa1-45025c76643c.png" align="right" height="70" size="cover">
<img src="https://user-images.githubusercontent.com/126669778/228373871-21c816c7-04b7-468c-8b25-5a0a20510968.png" align="right" height="50">

# pec1_David

## Clases

<details>

<summary>

## **Alumno**

</summary>

### Description

> &nbsp;&nbsp;&nbsp;&nbsp;**Alumno** contiene la informacion de cada alumno;
  
### Variables

**``String nombre``** : Contiene el nombre del alumno.
<br>
**``String apellidos``** : Contiene los apellidos del alumno.
<br>
**``String dni``** : Contiene el DNI del alumno.
  
### Metodos
  
</details>
<details>

<summary>

## **Aula**

</summary>

### Description

> &nbsp;&nbsp;&nbsp;&nbsp;**Aula** contiene los asientos disponibles y asignados, y donde se encuentra;
  
### Variables

**``int planta``** : Contiene el planta del colegio en el que se encuentra el aula.
<br>
**``int numero``** : Contiene el numero de aula dentro de la planta del colegio en el que se encuentra el aula.
<br>
**``Alumno dni[]``** : Contiene los asientos que hay en la sala (**ocupados** y **no ocupados**).
  
### Metodos
  
</details>
<details>

<summary>

## **Colegio**

</summary>

### Description

> &nbsp;&nbsp;&nbsp;&nbsp;**Colegio** contiene las aulas que hay en el colegio y la información del colegio;
  
### Variables

**``String nombre``** : Contiene el nombre del colegio.
<br>
**``String direccion``** : Contiene la direccion del colegio.
<br>
**``Aula aulas[]``** : Contiene una lista con todas las clases que hay en el colegio.

### Metodos
  
<details>

<summary>

### **AsignarAsiento**

</summary>

```java

String AsignarAsiento(Alumno alumno);

```

#### Descripción

  > &nbsp;&nbsp;&nbsp;&nbsp;La función **asignarAsiento()** busca entre todos los asientos de cada aula y asigna el primer asiento vacio en cualquier aula al alumno pasado como parametro.

#### Valor de retorno

  - Si **_no se ha pasado ningun alumno como parametro_** : Imprime por consola **"El campo alumno no puede estar vacio."** y retorna **``null``**.
  - Si **_no hay ningun asiento vacio_** : Imprime por consola **"No hay ningun asiento disponible en ningun aula."** y retorna **``null``**.
  - Si **_hay algún asiento vacio_** : Asigna ese asiento al alumno, el aula y el asiento asignado.

</details>
  
</details>
<details>

<summary>

## **UtilsColegio**

</summary>

### Description

> &nbsp;&nbsp;&nbsp;&nbsp;**Colegio** contiene funciones extra que nos pueden ser utiles para realizar ciertas cosas;
  
### Variables

### Metodos
  
<details>

<summary>

### **newAlumnos**

</summary>

```java

String newAlumnos(int cantidad);

```

#### Descripción

  > &nbsp;&nbsp;&nbsp;&nbsp;La función **newAlumnos()** nos permite crear una nueva lista de alumnos introduciendo por consola los datos de cada alumno.

#### Valor de retorno

  - Devuelve un array de alumnos con los nombres, apellidos y DNI's de todos los alumnos insertados.

</details>
  
</details>
<details>

<summary>

## **GestionColegios**

</summary>

### Description

> &nbsp;&nbsp;&nbsp;&nbsp;**GestionColegios** es la clase que contiene el metodo **_MAIN_** con el cual se crea un colegio con todas sus aulas y asientos;
  
### Variables

### Metodos
  
<details>

<summary>

### **asignarAsientos**

</summary>

```java

String asignarAsientos(Alumno alumnos[]);

```

#### Descripción

  > &nbsp;&nbsp;&nbsp;&nbsp;La función **asignarAsientos()** le asignaremos un asiento a cada alumno de la lista de alumnos que se nos pasa como parametro.

#### Valor de retorno

</details>
<details>

<summary>

### **MAIN**

</summary>

```java

void main(String[] args);

```

#### Descripción

  > &nbsp;&nbsp;&nbsp;&nbsp;La función **main()** es la funcion llamada al ejecutar el programa y, en este caso, se encarga de crear un colegio con sus respectivas aulas y una lista de alumnos los cuales serán asignados a los diferentes asientos que hay en cada aula.

#### Valor de retorno

</details>
  
</details>
