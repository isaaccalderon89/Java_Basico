
public class Introduccion2 {

	public static void main(String[] args) {
		/*
		 * El paradigma de programacion orientada a objetos define los programas en terminos de clases extraidos del 
		 * lenguaje del problema original.
		 * 
		 * La programacion orientada a objetos cumple con estas caracteristicas: 
		 * 
		 * 1.ABSTRACION: posibilidad de aislar un elemento del resto de elementos que lo acompañanpara centrarnos
		 * 				exclusivamente en él.
		 * 2.ENCAPSULAMIENTO: ocultamiento de los datos de un objeto de manera que solo pueda acceder a ellos a traves de los 
		 * 				métodos específicos para ese fin.
		 * 3.JERARQUIA: un programa orientado a objetos se define en términos de "clases de objetos" que se relacionan
		 * 				entre sí formando una jerarquía, que puede ser:
		 * 		
		 * 			* Por agregación: una clase contiene como propiedad un objeto de otra clase. Un objeto 'plaza contiene
		 * 					un objeto 'coche'.
		 * 			* Por herencia: una clase derivada (hija) heredatodas las propiedades y métodos de una clase base(madre).
		 * 
		 * 4.MODULARIDAD: capacidad de dividr una palicacion en partes más pequeñas denomidas módulos.
		 * 5.POLIMORFISMO: siginifica multiples formas. El polimorfismo nos permite operar con objetos de diferente tipo como 
		 * 				si fueran del mismo tipo, siempre que haya una relación entre ellos de tipo "es un/una".
		 * 
		 * Se va a explicar por medio de un ejemplo cómo funcionan las referencias a objetos en la clase coche.
		 * 
		 * REFERENCIA AL OBJETO ACTUAL: THIS
		 * ---------------------------------
		 * Dentro del código interno de una clase necesitamos hacer referencia al objeto actual. En java se consigue con THIS. 
		 * Se puede ver un ejemplo en 'miCoche'.
		 * 
		 * INTERFAZ DE UNA FUNCIÓN
		 * -----------------------
		 * Las funciones on un conjunto de líneas de cófigo que realizan una determinada tarea cuando son invocadas o llamadas.
		 * 
		 * Cada función está dividida en dos partes:
		 * 
		 * 1. IMPLEMENTACIÓN DE LA FUNCIÓN: donde se desarrollan las instrucciones necesarias para llevar a cabo la tarea. 
		 * 2. INTERFAZ DE LA FUNCIÓN: sistema de llamada a la función. Como usuarios, para realizar la llamada o inovación, solo nos interesa 
		 * saber los parámetros de entrada requeridos y el valor que obtendremos, no los detalles de implementación.
		 * 
		 * DISTINCIÓN ENTRE PARAMETRO Y ARGUMENTO
		 * --------------------------------------
		 * 
		 * Las funciones son un conjunto de líneas de código que realizan una determinada tarea cuando son invocadas o llamadas. 
		 * También se denominan subrutinas. 
		 * Los métodos o funciones pueden recibir los valores necesarios para realizar las tareas que tienen encomendadas. Estos valores se pasan
		 * a través de los parámetros. 
		 * A menudo se confunden los conceptos de parámetro y argumento, pero en realida hay una diferencia. 
		 * 
		 * 		*Los parámetros están definidos en la cabecera del método o función. 
		 * 		*Los argumentos aparecen en la llamada al método o función. 
		 *      *Los argumentos son enviados para ser recibidos por los parámetros de la función. 
		 *      
		 * VALORES DE RETORNO
		 * ------------------
		 * A menudo, el objetivo de una función es obtener el resultado de algún cálculo y la función debe ser capaz de devolver dicho resultado. 
		 * El formato general de un función Java es: 
		 * 
		 * 		modificadores tipoRetorno nombreFunción(parámetros){
		 * 	}
		 * Donde tipoRetorno es el tipo de resultado que devuelve la función. 
		 * Si la función debe devolver un resultado está obligada a utilizar una sentencia return para relaizar el retorno. La sentencia return, además de retornar el valor,
		 * finaliza la ejecución de la función devolviendo el control al punto de la llamada.
		 * 
		 * SOBRECARGA DE MÉTODOS
		 * ---------------------
		 *La sobrecarga de métodos es un sistema que permite diferentes implementaciones para un mismo método, aumentando así la versatilidad.
		 *VER EJEMPLO EN LA CLASE miCoche().
		 *
		 *SOBRECARGA DE LOS CONSTRUCTORES
		 *-------------------------------
		 *VER EJEMPLO DE LA CLASE miCoche().
		 *
		 *ATRIBUTOS DEL OBJETO Y ATRIBUTOS DE LA CLASE 
		 *--------------------------------------------
		 *En este apartado veremos los miembros de la clase de tipo STATIC. Para ello volveremos al ejemplo de los triángulos. 
		 *Es posible crear atributos o variables que pertenezcan a la clase y no a objeto; estas variables se declaran con la palabra static.
		 *
		 *Los atributos estáticos (miembros de la clase y no del objeto) deben ser invovados con el nombre de la clase y no del objeto. 
		 *
		 *Metodos estáticos y atributos estáticos: Desde un método estático no se puede acceder a las propiedades del objeto. Piensa que los métodos estáticos 
		 *pertenecen a la clase, no a ningún objeto concreto, por eso no tiene sentido que vayan a acceder a las propiedades. Los métodos estáticos tienen que seguir
		 *estas reglas: 
		 *
		 *	1. Un método estático no puede utilizar la palabra This(objeto actual).
		 *	2. un método estático no puede acceder a las propiedades del  objeto (variables de instancia de clase)
		 *  3. Un método estático no puede acceder a métodos que no sean estáticos. 
		 *  
		 *Un detalle muy importante sobre los métodos estáticos es que pueden ser invocados sin necesidad de crear ningún objeto. 
		 *
		 *	
		 *El método main es un método estático, por lo que no reuiqere objeto para ser invocado, pertenece a la clase, no al objeto. (Ver ejemplo
		 */
		
	}
	

}

