# SolidHomework

## Descripción

Para este trabajo se realizó un fork del código fuente proporcionado y se identificó qué principios SOLID estaban mal aplicados.

## Aplicación de los principios SOLID

### 1. Principio de Responsabilidad Única (SRP)

Se agregaron métodos específicos a la clase Estudiante para imprimir y guardar información en la base de datos, siguiendo el principio de Responsabilidad Única.

### 2. Principio de Abierto/Cerrado (OCP)

En la clase Main, se utilizó una estructura de datos (MateriaHandler) para manejar materias, permitiendo la creación o adición de nuevos casos sin modificar el código existente.

### 3. Principio de Sustitución de Liskov (LSP)

La clase Envio se volvió más específica según el tipo de envío gracias a la creación de la clase EnvioInformatica que extiende Envio.

### 4. Principio de Segregación de Interfaces (ISP)

La interfaz EmailService se dividió en métodos más específicos para evitar la implementación de métodos innecesarios.

### 5. Principio de Inversión de Dependencia (DIP)

La clase EnvioMaterial ahora trabaja con la interfaz EmailService a través de la inyección de dependencias.

## Ejecución

Para ejecutar la aplicación, utilice la clase Main donde hay un ejemplo de cómo se gestionan las materias para diferentes carreras.
