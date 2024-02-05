SolidHomework
  Descripción
    Para este trabajo se realizo un fork del codigo fuente proporcionado y se identifico cuales eran los principios SOLID que estaban mal aplicados.
  Aplicacion de los principios SOLID
    1. Principio de Responsabilidad Única (SRP)
    Se agregaron métodos específicos a la clase Estudiante para imprimir y guardar informacion en la base de datos, para esto se siguio el principio de Responsabilidad Única
    2. Principio de Abierto/Cerrado (OCP)
    En la clase Main, se ha utilizo una estructura de datos (MateriaHandler) para manejar materias, esto ahora permite que se puedan crear o agregar nuevos casos sin modificar el código existente.
    3. Principio de Sustitución de Liskov (LSP)
    Vuelve la clase Envio mas específica según el tipo de envio gracias a que se creo la clase EnvioInformatica que extiende Envio.
    4. Principio de Segregación de Interfaces (ISP)
    La interfaz EmailService se ha divide en métodos más específicos y esto evita que se tengan que implementar metodos inncesarios.
    5. Principio de Inversión de Dependencia (DIP)
    La clase EnvioMaterial ahora trabaja con la interfaz EmailService a través de la inyección de dependencias.
  Ejecución
  Para ejecutar la aplicación, utilice la clase Main donde hay un ejemplo de como se gestionan las materias para diferentes carreras.
