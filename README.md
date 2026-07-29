# **Panadería Sweet Bread** 🥐
Este es un proyecto de práctica enfocado en la construcción de **interfaces gráficas de usuario (GUI)** e implementación de **lógica de compras en tiempo real** utilizando Java y Swing.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/Apache_NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

## ¿Cómo funciona la aplicación?

La aplicación simula un punto de venta interactivo para una panadería, estructurado en tres categorías principales: **Postres, Panes y Bebidas**.

1. **Navegación por Catálogo:** El usuario puede alternar visualmente entre las vistas de Postres, Panes y Bebidas mediante el menú lateral.
2. **Cálculo de Precios Unitaros:** Al seleccionar un producto en el menú desplegable (`JComboBox`) e ingresar una cantidad, el sistema asigna el precio correspondiente usando estructuras de control (`switch`).
3. **Acumulación de Pedidos:** 
   * **Boton Calcular:** Muestra el subtotal del producto seleccionado multiplicando su precio unitario por la cantidad.
   * **Boton Agregar:** Añade el item a la orden global e integra la información en un desglose acumulativo.
   * **Boton Total compra:** Muestra un resumen general de la cuenta en pantalla (`JOptionPane`) con el detalle de items pedidos y el valor total a pagar.
   * **Boton Nueva Compra:** Limpia y reinicia las variables para procesar un nuevo pedido desde cero.

##  Características

* **Interfaz Intuitiva:** Componentes gráficos Swing (`JFrame`, `JPanel`, `JButton`, `JTextField`, `JComboBox`).
* **Apoyo Visual:** Ilustraciones  para cada producto dentro del menú.
* **Lógica de Negocio:** Eventos escuchadores (`ActionListener`) para procesar cálculos matemáticos y concatenación de cadenas en el reporte final.
* **Feedback al Usuario:** Uso de cuadros de diálogo contextuales (`JOptionPane`) para mostrar resúmenes de cuenta y alertas de selección.
